package com.rk.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rk.beans.Book;
@Repository
public interface BookDao extends JpaRepository<Book, Integer>{

}
