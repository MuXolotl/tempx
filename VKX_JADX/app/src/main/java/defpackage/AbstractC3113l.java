package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؕؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3113l implements InterfaceC13922l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC1220l f6656l;

    public AbstractC3113l(Function0 function0) {
        this.f6656l = AbstractC9968l.crashlytics(2, function0);
    }

    public final boolean equals(Object obj) {
        return AbstractC8576l.yandex(subs(), obj);
    }

    @Override // defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public final boolean firebase() {
        return subs().firebase();
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return subs().getName();
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return subs().getParameters();
    }

    @Override // defpackage.InterfaceC6902l
    public final List getTypeParameters() {
        return subs().getTypeParameters();
    }

    public final int hashCode() {
        return subs().hashCode();
    }

    @Override // defpackage.InterfaceC6902l
    public final Object isVip(Map map) {
        return subs().isVip(map);
    }

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return subs().smaato();
    }

    public final InterfaceC13922l subs() {
        return (InterfaceC13922l) this.f6656l.getValue();
    }

    public final String toString() {
        return subs().toString();
    }

    @Override // defpackage.InterfaceC6902l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo823volatile() {
        return subs().mo823volatile();
    }
}
