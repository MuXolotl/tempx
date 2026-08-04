package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lَؘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10515l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21390l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21391l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21392l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21393l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f21394l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f21395l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f21396l;

    public /* synthetic */ C10515l(InterfaceC17242l interfaceC17242l, InterfaceC5404l interfaceC5404l, InterfaceC3501l interfaceC3501l, int i, C15578l c15578l, int i2) {
        this.f21393l = 1;
        C8565l c8565l = C8565l.f17670l;
        this.f21394l = interfaceC17242l;
        this.f21396l = interfaceC5404l;
        this.f21391l = interfaceC3501l;
        this.f21392l = i;
        this.f21390l = c15578l;
        this.f21395l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f21393l;
        int i2 = this.f21395l;
        int i3 = this.f21392l;
        Object obj3 = this.f21391l;
        Object obj4 = this.f21396l;
        Object obj5 = this.f21394l;
        Object obj6 = this.f21390l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC7837l.yandex((C15578l) obj6, (Function0) obj5, (C5866l) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(i3 | 1), this.f21395l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC7039l.crashlytics((InterfaceC17242l) obj5, (InterfaceC5404l) obj4, (InterfaceC3501l) obj3, this.f21392l, (C15578l) obj6, (C6956l) obj, iPurchase);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                C10053l.loadAd((InterfaceC17045l) obj6, (String) obj5, (InterfaceC12001l) obj4, this.f21392l, (C2607l) obj3, (C6956l) obj, iPurchase2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC12811l.yandex((C10936l) obj5, (C0260l) obj4, (C9472l) obj3, (C15578l) obj6, (C6956l) obj, AbstractC0545l.purchase(i3 | 1), this.f21395l);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0133l.amazon((C15578l) obj6, (C15578l) obj5, (InterfaceC17242l) obj4, (Function3) obj3, (C6956l) obj, AbstractC0545l.purchase(i3 | 1), this.f21395l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C10515l(C15578l c15578l, InterfaceC14328l interfaceC14328l, Object obj, InterfaceC14328l interfaceC14328l2, int i, int i2, int i3) {
        this.f21393l = i3;
        this.f21390l = c15578l;
        this.f21394l = interfaceC14328l;
        this.f21396l = obj;
        this.f21391l = interfaceC14328l2;
        this.f21392l = i;
        this.f21395l = i2;
    }

    public /* synthetic */ C10515l(InterfaceC17045l interfaceC17045l, String str, InterfaceC12001l interfaceC12001l, int i, C2607l c2607l, int i2) {
        this.f21393l = 2;
        this.f21390l = interfaceC17045l;
        this.f21394l = str;
        this.f21396l = interfaceC12001l;
        this.f21392l = i;
        this.f21391l = c2607l;
        this.f21395l = i2;
    }

    public /* synthetic */ C10515l(C10936l c10936l, C0260l c0260l, C9472l c9472l, C15578l c15578l, int i, int i2) {
        this.f21393l = 3;
        this.f21394l = c10936l;
        this.f21396l = c0260l;
        this.f21391l = c9472l;
        this.f21390l = c15578l;
        this.f21392l = i;
        this.f21395l = i2;
    }
}
