package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12002l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C1008l f23915l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f23916l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f23917l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f23918l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public EnumC9065l f23919l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C15178l f23920l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23921l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12002l(InterfaceC2262l interfaceC2262l, C15178l c15178l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23917l = interfaceC2262l;
        this.f23920l = c15178l;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c0, B:43:0x00c4), top: B:50:0x0014 }] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C1008l c1008lYandex;
        EnumC9065l enumC9065l;
        long j;
        C17249l c17249l;
        C1008l c1008l;
        C1008l c1008l2;
        C15730l c15730l;
        int i = this.f23921l;
        int i2 = 1;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C17249l c17249l2 = (C17249l) this.f23916l;
            c1008lYandex = AbstractC11190l.yandex(Boolean.FALSE);
            long jLoadAd = c17249l2.purchase().loadAd();
            this.f23916l = c17249l2;
            this.f23915l = c1008lYandex;
            enumC9065l = EnumC9065l.f18654l;
            this.f23919l = enumC9065l;
            this.f23918l = jLoadAd;
            this.f23921l = 1;
            Object objLoadAd = AbstractC18112l.loadAd(c17249l2, this, 1);
            if (objLoadAd != enumC9342l) {
                j = jLoadAd;
                c17249l = c17249l2;
                obj = objLoadAd;
            }
            return enumC9342l;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c1008l2 = (C1008l) this.f23916l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    c15730l = (C15730l) obj;
                    if (c15730l != null) {
                        c15730l.yandex();
                    }
                    Boolean bool = Boolean.FALSE;
                    c1008l2.getClass();
                    c1008l2.remoteconfig(null, bool);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    c1008l2.getClass();
                    c1008l2.remoteconfig(null, bool2);
                    throw th;
                }
            }
            EnumC9065l enumC9065l2 = this.f23919l;
            c1008l = this.f23915l;
            c17249l = (C17249l) this.f23916l;
            try {
                AbstractC2829l.crashlytics(obj);
                Boolean bool3 = Boolean.FALSE;
                c1008l.getClass();
                c1008l.remoteconfig(null, bool3);
            } catch (C15658l unused) {
                enumC9065l = enumC9065l2;
                c1008lYandex = c1008l;
                AbstractC10999l.mopub(this.f23917l, null, 4, new C7641l(c1008lYandex, this.f23920l, interfaceC14029l, 15), 1);
                this.f23916l = c1008lYandex;
                this.f23915l = null;
                this.f23919l = null;
                this.f23921l = 3;
                obj = AbstractC18112l.isPro(c17249l, enumC9065l, this);
                if (obj != enumC9342l) {
                    c1008l2 = c1008lYandex;
                    c15730l = (C15730l) obj;
                    if (c15730l != null) {
                        c15730l.yandex();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    c1008l2.getClass();
                    c1008l2.remoteconfig(null, bool4);
                }
                return enumC9342l;
            } catch (Throwable th2) {
                th = th2;
                c1008l2 = c1008l;
                Boolean bool5 = Boolean.FALSE;
                c1008l2.getClass();
                c1008l2.remoteconfig(null, bool5);
                throw th;
            }
            return Unit.INSTANCE;
        }
        long j2 = this.f23918l;
        EnumC9065l enumC9065l3 = this.f23919l;
        C1008l c1008l3 = this.f23915l;
        C17249l c17249l3 = (C17249l) this.f23916l;
        AbstractC2829l.crashlytics(obj);
        enumC9065l = enumC9065l3;
        c1008lYandex = c1008l3;
        j = j2;
        c17249l = c17249l3;
        long j3 = j;
        int i3 = ((C15730l) obj).subs;
        if (i3 == 1 || i3 == 3) {
            try {
                try {
                    C2057l c2057l = new C2057l(enumC9065l, interfaceC14029l, i2);
                    this.f23916l = c17249l;
                    this.f23915l = c1008lYandex;
                    this.f23919l = enumC9065l;
                    this.f23921l = 2;
                    if (c17249l.billing(j3, c2057l, this) != enumC9342l) {
                        c1008l = c1008lYandex;
                        Boolean bool6 = Boolean.FALSE;
                        c1008l.getClass();
                        c1008l.remoteconfig(null, bool6);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c1008l2 = c1008lYandex;
                    Boolean bool7 = Boolean.FALSE;
                    c1008l2.getClass();
                    c1008l2.remoteconfig(null, bool7);
                    throw th;
                }
            } catch (C15658l unused2) {
                AbstractC10999l.mopub(this.f23917l, null, 4, new C7641l(c1008lYandex, this.f23920l, interfaceC14029l, 15), 1);
                this.f23916l = c1008lYandex;
                this.f23915l = null;
                this.f23919l = null;
                this.f23921l = 3;
                obj = AbstractC18112l.isPro(c17249l, enumC9065l, this);
                if (obj != enumC9342l) {
                    c1008l2 = c1008lYandex;
                    c15730l = (C15730l) obj;
                    if (c15730l != null) {
                        c15730l.yandex();
                    }
                    Boolean bool8 = Boolean.FALSE;
                    c1008l2.getClass();
                    c1008l2.remoteconfig(null, bool8);
                    return Unit.INSTANCE;
                }
            }
            return enumC9342l;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C12002l c12002l = new C12002l(this.f23917l, this.f23920l, interfaceC14029l);
        c12002l.f23916l = obj;
        return c12002l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12002l) ads((InterfaceC14029l) obj2, (C17249l) obj)).Signature(Unit.INSTANCE);
    }
}
