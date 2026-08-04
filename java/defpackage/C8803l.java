package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8803l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18089l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18090l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18091l;

    public /* synthetic */ C8803l(int i, Object obj, int i2) {
        this.f18091l = i2;
        this.f18090l = i;
        this.f18089l = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f18091l;
        int i2 = this.f18090l;
        Object obj = this.f18089l;
        switch (i) {
            case 0:
                ((C1774l) obj).m4125private(new C13888l(i2 > 0));
                return Unit.INSTANCE;
            case 1:
                ((C18159l) obj).f35557l.subs(i2);
                C2491l.yandex.getClass();
                C16543l c16543l = C2491l.purchase;
                InterfaceC13922l interfaceC13922l = C2491l.loadAd[0];
                Integer numValueOf = Integer.valueOf(i2);
                c16543l.getClass();
                ((SharedPreferences) c16543l.f32482l).edit().putInt("startup_index", numValueOf.intValue()).apply();
                return Unit.INSTANCE;
            case 2:
                ((C11390l) obj).amazon.invoke(Integer.valueOf(i2));
                return Unit.INSTANCE;
            case 3:
                return new C2887l(i2, 0.0f, (Function0) obj);
            case 4:
                int i3 = i2 * 60;
                C12942l.purchase = true;
                C12942l.loadAd = i3;
                C12942l.amazon = i3;
                ((C10056l) obj).m2876try(i3);
                return Unit.INSTANCE;
            case 5:
                return new C5245l(Integer.valueOf(i2), (String) obj);
            case 6:
                ((C15308l) obj).subs(i2);
                return Unit.INSTANCE;
            case 7:
                return Integer.valueOf(((C3737l) obj).billing.loadAd.amazon(i2));
            case 8:
                EnumC7195l enumC7195l = (EnumC7195l) EnumC7195l.f15028l.get(i2);
                ((C6111l) obj).f12898l.smaato(enumC7195l);
                C8994l.yandex.getClass();
                C8994l.firebase.loadAd(enumC7195l);
                return Unit.INSTANCE;
            default:
                ((Function1) obj).invoke(Integer.valueOf(i2));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C8803l(Object obj, int i, int i2) {
        this.f18091l = i2;
        this.f18089l = obj;
        this.f18090l = i;
    }
}
