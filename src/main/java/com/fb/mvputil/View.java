package com.fb.mvputil;

public interface View<P extends  Presenter> {
    P getPresenter();
}
