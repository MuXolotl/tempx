package androidx.car.app.model;

import android.annotation.SuppressLint;
import defpackage.InterfaceC10793l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
@SuppressLint({"ListenerInterface"})
public final class ParkedOnlyOnClickListener implements InterfaceC10793l {
    private final InterfaceC10793l mListener;

    private ParkedOnlyOnClickListener(InterfaceC10793l interfaceC10793l) {
        this.mListener = interfaceC10793l;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static ParkedOnlyOnClickListener create(InterfaceC10793l interfaceC10793l) {
        Objects.requireNonNull(interfaceC10793l);
        return new ParkedOnlyOnClickListener(interfaceC10793l);
    }

    @Override // defpackage.InterfaceC10793l
    public void onClick() {
        this.mListener.onClick();
    }
}
