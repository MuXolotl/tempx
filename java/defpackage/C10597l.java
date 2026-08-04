package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10597l implements InterfaceC17792l {
    public final /* synthetic */ Object admob;
    public final /* synthetic */ Map amazon;
    public final /* synthetic */ InterfaceC14328l billing;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ Object mopub;
    public final /* synthetic */ Function1 purchase;
    public final /* synthetic */ int yandex = 0;

    public C10597l(int i, int i2, Map map, C3006l c3006l, C3956l c3956l, C16441l c16441l, AbstractC11754l abstractC11754l) {
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = map;
        this.purchase = c3006l;
        this.billing = c3956l;
        this.mopub = c16441l;
        this.admob = abstractC11754l;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        switch (this.yandex) {
            case 0:
                return null;
            default:
                return (C3006l) this.purchase;
        }
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        switch (this.yandex) {
            case 0:
                return null;
            default:
                return (C3956l) this.billing;
        }
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        C16857l c16857l;
        int i = this.yandex;
        Object obj = this.admob;
        Object obj2 = this.mopub;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) this.billing;
                C3654l c3654l = ((C9117l) obj).f18732l;
                if (((C2121l) obj2).mo992import() && (c16857l = ((C11103l) c3654l.f7703l.amazon).f22308l) != null) {
                    function1.invoke(c16857l.f23546l);
                } else {
                    function1.invoke(((C11103l) c3654l.f7703l.amazon).f23546l);
                }
                break;
            default:
                ((C16441l) obj2).invoke(((AbstractC11754l) obj).f23546l);
                break;
        }
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        switch (this.yandex) {
            case 0:
                return this.purchase;
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        switch (this.yandex) {
            case 0:
                break;
        }
        return this.amazon;
    }

    public C10597l(int i, int i2, Map map, Function1 function1, C2121l c2121l, C9117l c9117l, Function1 function2) {
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = map;
        this.purchase = function1;
        this.mopub = c2121l;
        this.admob = c9117l;
        this.billing = function2;
    }
}
