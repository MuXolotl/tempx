package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lؚؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5260l implements InterfaceC1925l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f11340l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String[] f11341l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC5123l f11342l;

    public C5260l(EnumC5123l enumC5123l, String... strArr) {
        this.f11342l = enumC5123l;
        this.f11341l = strArr;
        String str = enumC5123l.f11153l;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f11340l = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        C8741l.yandex.getClass();
        return C8741l.crashlytics;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        return (C11669l) C11669l.billing.getValue();
    }

    public final String toString() {
        return this.f11340l;
    }

    @Override // defpackage.InterfaceC1925l
    public final Collection yandex() {
        return C2580l.f5619l;
    }
}
