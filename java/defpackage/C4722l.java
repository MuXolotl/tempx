package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؙؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4722l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2391l f9584l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13849l f9585l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9586l;

    public /* synthetic */ C4722l(C2391l c2391l, C13849l c13849l) {
        this.f9586l = 0;
        this.f9584l = c2391l;
        this.f9585l = c13849l;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C6393l c6393l;
        int i = this.f9586l;
        Object obj = null;
        C2391l c2391l = this.f9584l;
        C13849l c13849l = this.f9585l;
        switch (i) {
            case 0:
                for (Object obj2 : c2391l.amazon) {
                    if (((C6393l) obj2).crashlytics == EnumC11113l.f22321l) {
                        obj = obj2;
                        c6393l = (C6393l) obj;
                        if (c6393l == null) {
                            c6393l = (C6393l) AbstractC16901l.m4217extends(c2391l.amazon);
                        }
                        if (c6393l != null) {
                            c13849l.m3787finally(c2391l, c6393l);
                        }
                        break;
                    }
                }
                c6393l = (C6393l) obj;
                if (c6393l == null) {
                    c6393l = (C6393l) AbstractC16901l.m4217extends(c2391l.amazon);
                }
                if (c6393l != null) {
                    c13849l.m3787finally(c2391l, c6393l);
                }
                break;
            case 1:
                AbstractC9033l.crashlytics((AppActivity) c13849l.isVip(), new C0384l(c13849l, c2391l, (InterfaceC14029l) null, 8));
                break;
            default:
                AbstractC11397l.mopub((AppActivity) c13849l.isVip(), new C7730l(29, c2391l));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4722l(C13849l c13849l, C2391l c2391l, int i) {
        this.f9586l = i;
        this.f9585l = c13849l;
        this.f9584l = c2391l;
    }
}
