package region.back.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import region.back.domain.region.Sido;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SidoRepository {

    private final EntityManager em;

    public void save(Sido sido) {
        em.persist(sido);
    }

    // id로 해당하는 시/도 찾기
    public Sido findOne(Long id) {
        return em.find(Sido.class, id);
    }

    // 시/도 목록 뿌리기
    public List<Sido> findAll() {
        return em.createQuery("select s from Sido s", Sido.class)
                .getResultList();
    }

    public List<Sido> findByName(String name) {
        // like로 검색
        return em.createQuery("select s from Sido s where s.name = :name", Sido.class)
                .setParameter("name", name)
                .getResultList();
    }
}
