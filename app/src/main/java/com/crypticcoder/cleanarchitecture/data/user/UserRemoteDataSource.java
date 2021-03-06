package com.crypticcoder.cleanarchitecture.data.user;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.crypticcoder.cleanarchitecture.data.CreateListener;
import com.crypticcoder.cleanarchitecture.data.DataListListener;
import com.crypticcoder.cleanarchitecture.data.DataListener;
import com.crypticcoder.cleanarchitecture.data.DeleteListener;
import com.crypticcoder.cleanarchitecture.data.UpdateListener;
import com.crypticcoder.cleanarchitecture.data.mappers.JSONObjectMapper;
import com.crypticcoder.cleanarchitecture.data.mappers.impl.JSONObjectUserMapper;
import com.crypticcoder.cleanarchitecture.domain.model.User;
import com.crypticcoder.cleanarchitecture.domain.model.UserListFilter;

import org.json.JSONObject;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Cryptic Coder on 28,October,2017
 */

public class UserRemoteDataSource implements UserDataSource {

    private Context mContext;

    private JSONObjectMapper<JSONObject, User> mJSONMapper;

    @Inject
    public UserRemoteDataSource(@NonNull Context context,
                                @Named("JSONObjectUserMapper") @NonNull JSONObjectMapper<JSONObject, User> mapper) {
        mContext = context;
        mJSONMapper = mapper;
    }

    @Override
    public void createUser(@NonNull User book) {

    }

    @Override
    public void createUser(@NonNull User book, @NonNull CreateListener<User> createListener) {

    }

    @Override
    public void updateUser(@NonNull User book) {

    }

    @Override
    public void updateUser(@NonNull User book, @NonNull UpdateListener<User> updateListener) {

    }

    @Override
    public void deleteUser(@NonNull Long bookId) {

    }

    @Override
    public void deleteUser(@NonNull Long bookId, @NonNull DeleteListener deleteListener) {

    }

    @Override
    public void getUser(@NonNull Long bookId, @NonNull DataListener<User> dataListener) {

    }

    @Override
    public void getUserList(@Nullable UserListFilter bookListFilter, @NonNull DataListListener<User> dataListListener) {

    }
}
