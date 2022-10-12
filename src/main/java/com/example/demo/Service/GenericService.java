package com.example.demo.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class GenericService<T>{
    JpaRepository<T,Integer> repository;
//    @Autowired
//    GenericService(JpaRepository<T,Long> repository)
//    {
//        this.repository = repository;
//    }
    public List<T> getAll(){

        return  repository.findAll();
    }
    public T get(int id)
    {
        return repository.findById(id).get();
    }
    public void add(T t){

        repository.save(t);
    };
    public void delete(int id ){
        repository.deleteById(id);
    }

    public void update(T t) {

       // T temp = repository.findById(t.getId()).get();
    }

}
