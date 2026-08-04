package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lؒۥۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1476l implements InterfaceC9198l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC9198l
    public final Object amazon(C17467l c17467l, InterfaceC14029l interfaceC14029l) {
        C9261l c9261l;
        C6393l c6393l;
        String str;
        if (interfaceC14029l instanceof C9261l) {
            c9261l = (C9261l) interfaceC14029l;
            int i = c9261l.f19043l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9261l.f19043l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9261l = new C9261l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c9261l = new C9261l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objYandex = c9261l.f19042l;
        int i2 = c9261l.f19043l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objYandex);
                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                C10507l c10507l = c17467l.yandex;
                AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
                C3414l c3414l = abstractC18643l instanceof C3414l ? (C3414l) abstractC18643l : null;
                if (c3414l != null && (c6393l = c3414l.loadAd) != null && (str = c6393l.loadAd) != null) {
                    int i3 = (int) c17467l.amazon;
                    c9261l.f19043l = 1;
                    objYandex = AbstractC1788l.yandex(c7644lLoadAd, str, i3, c9261l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9198l
    public final Object billing(C17467l c17467l, C2323l c2323l) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC9198l
    public final Object crashlytics(C17467l c17467l, C17467l c17467l2, EnumC8098l enumC8098l, InterfaceC14029l interfaceC14029l) {
        C17260l c17260l;
        C6393l c6393l;
        String str;
        if (interfaceC14029l instanceof C17260l) {
            c17260l = (C17260l) interfaceC14029l;
            int i = c17260l.f33488l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17260l.f33488l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17260l = new C17260l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c17260l = new C17260l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objYandex = c17260l.f33487l;
        int i2 = c17260l.f33488l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objYandex);
                if (loadAd(c17467l)) {
                    C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                    C10507l c10507l = c17467l.yandex;
                    AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
                    C3414l c3414l = abstractC18643l instanceof C3414l ? (C3414l) abstractC18643l : null;
                    if (c3414l != null && (c6393l = c3414l.loadAd) != null && (str = c6393l.loadAd) != null) {
                        int i3 = (int) c17467l.amazon;
                        c17260l.f33488l = 1;
                        objYandex = AbstractC1788l.yandex(c7644lLoadAd, str, i3, c17260l);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (objYandex == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9198l
    public final boolean loadAd(C17467l c17467l) {
        if (!(c17467l.loadAd instanceof C1407l)) {
            return false;
        }
        C10507l c10507l = c17467l.yandex;
        return (c10507l != null ? c10507l.loadAd : null) instanceof C3414l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC9198l
    public final Object purchase(C17467l c17467l, C17467l c17467l2, EnumC8376l enumC8376l, InterfaceC14029l interfaceC14029l) {
        C7911l c7911l;
        C6393l c6393l;
        String str;
        if (interfaceC14029l instanceof C7911l) {
            c7911l = (C7911l) interfaceC14029l;
            int i = c7911l.f16496l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7911l.f16496l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7911l = new C7911l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c7911l = new C7911l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objYandex = c7911l.f16495l;
        int i2 = c7911l.f16496l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objYandex);
                if (loadAd(c17467l2)) {
                    C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                    C10507l c10507l = c17467l2.yandex;
                    AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
                    C3414l c3414l = abstractC18643l instanceof C3414l ? (C3414l) abstractC18643l : null;
                    if (c3414l != null && (c6393l = c3414l.loadAd) != null && (str = c6393l.loadAd) != null) {
                        int i3 = (int) c17467l2.amazon;
                        c7911l.f16496l = 1;
                        objYandex = AbstractC1788l.yandex(c7644lLoadAd, str, i3, c7911l);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (objYandex == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9198l
    public final Object yandex(C17467l c17467l, C15682l c15682l) {
        return Unit.INSTANCE;
    }
}
