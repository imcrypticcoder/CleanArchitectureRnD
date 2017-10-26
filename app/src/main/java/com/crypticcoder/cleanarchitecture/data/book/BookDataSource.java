package com.crypticcoder.cleanarchitecture.data.book;

import android.support.annotation.NonNull;

import com.crypticcoder.cleanarchitecture.data.CreateListener;
import com.crypticcoder.cleanarchitecture.data.DataListListener;
import com.crypticcoder.cleanarchitecture.data.DataListener;
import com.crypticcoder.cleanarchitecture.data.DeleteListener;
import com.crypticcoder.cleanarchitecture.data.UpdateListener;
import com.crypticcoder.cleanarchitecture.domain.model.Book;

/**
 * Created by Cryptic Coder on 26,October,2017
 */

public interface BookDataSource {

    void getBook(@NonNull Long bookId, @NonNull DataListener<Book> dataListener);

    void getBookList(@NonNull DataListListener<Book> dataListListener);

    void createBook(@NonNull Book book);
    void createBook(@NonNull Book book, @NonNull CreateListener<Book> createListener);

    void updateBook(@NonNull Book book);
    void updateBook(@NonNull Book book, @NonNull UpdateListener<Book> updateListener);

    void deleteBook(@NonNull Long bookId);
    void deleteBook(@NonNull Long bookId, @NonNull DeleteListener deleteListener);
}