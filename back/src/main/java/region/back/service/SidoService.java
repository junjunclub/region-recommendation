package region.back.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import region.back.domain.region.Sido;
import region.back.repository.SidoRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SidoService {

    private final SidoRepository sidoRepository;


    /**
    * 시도 전체 리스트
    * */
    public List<Sido> findSidos() {
        return sidoRepository.findAll();
    }


    /**
     * 검색한 시도 리스트
     * */
    public List<Sido> findOne(String name) {
        return sidoRepository.findByName(name);
    }
}
