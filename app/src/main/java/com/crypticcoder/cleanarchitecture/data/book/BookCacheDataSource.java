package com.crypticcoder.cleanarchitecture.data.book;

import android.support.annotation.NonNull;

import com.crypticcoder.cleanarchitecture.data.DataListListener;
import com.crypticcoder.cleanarchitecture.data.DataListener;
import com.crypticcoder.cleanarchitecture.domain.model.Book;

/**
 * Created by Cryptic Coder on 26,October,2017
 */

public class BookCacheDataSource implements BookDataSource {

    @Override
    public void getBook(@NonNull Long bookId, @NonNull DataListener<Book> dataListener) {

    }

    @Override
    public void getBookList(@NonNull DataListListener<Book> dataListListener) {

    }

    @Override
    public void createBook(@NonNull Book book) {

    }

    @Override
    public void updateBook(@NonNull Book book) {

    }

    @Override
    public void deleteBook(@NonNull Long bookId) {

    }
}
