package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import defpackage.C8339l;
import defpackage.InterfaceC11796l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC6511l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class ProviderSignInMethod implements InterfaceC11796l {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        Objects.requireNonNull(action);
        if (action.getType() != 1) {
            C8339l.metrica("The action must not be a standard action");
            throw null;
        }
        InterfaceC6511l onClickDelegate = action.getOnClickDelegate();
        Objects.requireNonNull(onClickDelegate);
        if (onClickDelegate.isParkedOnly()) {
            this.mAction = action;
        } else {
            C8339l.metrica("The action must use a ParkedOnlyOnClickListener");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public Action getAction() {
        Action action = this.mAction;
        Objects.requireNonNull(action);
        return action;
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    public String toString() {
        return "[action:" + this.mAction + "]";
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}
