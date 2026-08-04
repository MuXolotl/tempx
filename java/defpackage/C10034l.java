package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؒۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10034l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12428l f20451l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20452l;

    public /* synthetic */ C10034l(C12428l c12428l, int i) {
        this.f20452l = i;
        this.f20451l = c12428l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C16310l c16310l;
        int i = this.f20452l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C12428l c12428l = this.f20451l;
        switch (i) {
            case 0:
                Object objLoadAd = c12428l.f24537l.loadAd(interfaceC14029l, obj);
                return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
            case 1:
                if (interfaceC14029l instanceof C16310l) {
                    c16310l = (C16310l) interfaceC14029l;
                    int i2 = c16310l.f31905l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16310l.f31905l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16310l = new C16310l(this, interfaceC14029l);
                    }
                } else {
                    c16310l = new C16310l(this, interfaceC14029l);
                }
                Object obj2 = c16310l.f31904l;
                int i3 = c16310l.f31905l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj2);
                    if (obj == null) {
                        obj = AbstractC2878l.yandex;
                    }
                    c16310l.f31905l = 1;
                    if (c12428l.f24537l.loadAd(c16310l, obj) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj2);
                }
                return Unit.INSTANCE;
            default:
                Object objLoadAd2 = c12428l.f24537l.loadAd(interfaceC14029l, obj);
                return objLoadAd2 == enumC9342l ? objLoadAd2 : Unit.INSTANCE;
        }
    }
}
