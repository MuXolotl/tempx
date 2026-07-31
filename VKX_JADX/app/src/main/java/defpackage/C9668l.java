package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9668l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14216l f19747l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19748l;

    public /* synthetic */ C9668l(C14216l c14216l, InterfaceC17593l interfaceC17593l) {
        this.f19748l = 3;
        this.f19747l = c14216l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19748l;
        boolean z = false;
        C14216l c14216l = this.f19747l;
        switch (i) {
            case 0:
                C10086l c10086l = c14216l.f27813l.tapsense;
                Boolean bool = Boolean.TRUE;
                c10086l.setValue(bool);
                c14216l.f27813l.subscription.setValue(bool);
                C14216l.m3836l(c14216l.f27813l, (String) ((C5828l) ((InterfaceC4356l) obj)).loadAd(), c14216l.f27811l);
                return bool;
            case 1:
                List list = (List) obj;
                if (c14216l.f27813l.amazon() != null) {
                    list.add(c14216l.f27813l.amazon().yandex);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                C14216l.m3836l(c14216l.f27813l, ((C3625l) obj).f7563l, c14216l.f27811l);
                return Boolean.TRUE;
            default:
                C3625l c3625l = (C3625l) obj;
                if (c14216l.f27811l) {
                    C12983l c12983l = c14216l.f27813l.purchase;
                    if (c12983l != null) {
                        List listRemoteconfig = AbstractC14055l.remoteconfig(new C2680l(), new C0597l(c3625l, 1));
                        C17812l c17812l = c14216l.f27813l;
                        C18595l c18595l = c17812l.amazon;
                        C10403l c10403l = c17812l.license;
                        C0639l c0639lLoadAd = c18595l.loadAd(listRemoteconfig);
                        c12983l.yandex(null, c0639lLoadAd);
                        c10403l.invoke(c0639lLoadAd);
                    } else {
                        C0639l c0639l = c14216l.f27815l;
                        String str = c0639l.yandex.f7563l;
                        long j = c0639l.loadAd;
                        int i2 = C12814l.crashlytics;
                        String string = AbstractC12024l.m3327import(str, (int) (j >> 32), (int) (j & 4294967295L), c3625l).toString();
                        int length = c3625l.f7563l.length() + ((int) (c14216l.f27815l.loadAd >> 32));
                        c14216l.f27813l.license.invoke(new C0639l(AbstractC2296l.loadAd(length, length), 4, string));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ C9668l(C14216l c14216l, int i) {
        this.f19748l = i;
        this.f19747l = c14216l;
    }
}
