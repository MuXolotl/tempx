package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؐؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8457l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f17493l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f17494l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17495l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f17496l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f17497l;

    public /* synthetic */ C8457l(C11636l c11636l, int i, long j, int i2) {
        this.f17496l = c11636l;
        this.f17493l = i;
        this.f17494l = j;
        this.f17497l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17495l) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC7470l.yandex((C11636l) this.f17496l, this.f17493l, this.f17494l, (C6956l) obj, AbstractC0545l.purchase(this.f17497l | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC5889l.amazon((InterfaceC17242l) this.f17496l, this.f17494l, (C6956l) obj, AbstractC0545l.purchase(this.f17493l | 1), this.f17497l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8457l(InterfaceC17242l interfaceC17242l, long j, int i, int i2) {
        this.f17496l = interfaceC17242l;
        this.f17494l = j;
        this.f17493l = i;
        this.f17497l = i2;
    }
}
