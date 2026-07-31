package androidx.car.app.model;

import android.annotation.SuppressLint;
import defpackage.InterfaceC10793l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC6511l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class ClickableSpan extends CarSpan {
    private final InterfaceC6511l mOnClickDelegate;

    private ClickableSpan(InterfaceC10793l interfaceC10793l) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(interfaceC10793l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static ClickableSpan create(InterfaceC10793l interfaceC10793l) {
        Objects.requireNonNull(interfaceC10793l);
        return new ClickableSpan(interfaceC10793l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public InterfaceC6511l getOnClickDelegate() {
        InterfaceC6511l interfaceC6511l = this.mOnClickDelegate;
        Objects.requireNonNull(interfaceC6511l);
        return interfaceC6511l;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}
