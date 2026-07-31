package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15022l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f29541l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f29542l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f29543l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29544l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C11090l f29545l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f29546l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ long f29547l;

    public /* synthetic */ C15022l(C15578l c15578l, Function2 function2, Function2 function3, C11090l c11090l, long j, long j2, int i) {
        this.f29543l = c15578l;
        this.f29541l = function2;
        this.f29546l = function3;
        this.f29545l = c11090l;
        this.f29547l = j;
        this.f29542l = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29544l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6956l.m2123default(-168956728);
                    c6956l.m2123default(-942207887);
                    AbstractC13106l.yandex(this.f29543l, this.f29541l, this.f29546l, this.f29545l, this.f29547l, this.f29542l, c6956l, 0);
                    c6956l.startapp(false);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC13106l.yandex(this.f29543l, this.f29541l, this.f29546l, this.f29545l, this.f29547l, this.f29542l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15022l(Function2 function2, C15578l c15578l, Function2 function3, C11090l c11090l, long j, long j2) {
        this.f29541l = function2;
        this.f29543l = c15578l;
        this.f29546l = function3;
        this.f29545l = c11090l;
        this.f29547l = j;
        this.f29542l = j2;
    }
}
