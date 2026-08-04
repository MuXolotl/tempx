package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0907l implements InterfaceC2449l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18371l f2573l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C0504l f2574l;

    public C0907l(C0504l c0504l, C18371l c18371l) {
        this.f2574l = c0504l;
        this.f2573l = c18371l;
    }

    @Override // defpackage.InterfaceC2449l
    public final Map amazon() {
        return this.f2574l.amazon();
    }

    @Override // defpackage.InterfaceC2449l
    public final InterfaceC18327l billing(String str, Function0 function0) {
        return this.f2574l.billing(str, function0);
    }

    @Override // defpackage.InterfaceC2449l
    public final boolean crashlytics(Object obj) {
        return this.f2574l.crashlytics(obj);
    }

    @Override // defpackage.InterfaceC2449l
    public final Object purchase(String str) {
        return this.f2574l.purchase(str);
    }
}
