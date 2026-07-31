package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lَٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17957l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f34944l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34945l;

    public /* synthetic */ C17957l(InterfaceC9427l interfaceC9427l, int i) {
        this.f34945l = i;
        this.f34944l = interfaceC9427l;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C7579l c7579l;
        C12275l c12275l;
        int i = this.f34945l;
        InterfaceC9427l interfaceC9427l = this.f34944l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C7579l) {
                    c7579l = (C7579l) interfaceC14029l;
                    int i2 = c7579l.f15586l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7579l.f15586l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7579l = new C7579l(this, interfaceC14029l);
                    }
                } else {
                    c7579l = new C7579l(this, interfaceC14029l);
                }
                Object obj2 = c7579l.f15587l;
                int i3 = c7579l.f15586l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj2);
                    if (obj instanceof C14759l) {
                        c7579l.f15586l = 1;
                        if (interfaceC9427l.isPro(obj, c7579l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C12275l) {
                    c12275l = (C12275l) interfaceC14029l;
                    int i4 = c12275l.f24337l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12275l.f24337l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12275l = new C12275l(this, interfaceC14029l);
                    }
                } else {
                    c12275l = new C12275l(this, interfaceC14029l);
                }
                Object obj3 = c12275l.f24338l;
                int i5 = c12275l.f24337l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj3);
                    if (obj instanceof C14759l) {
                        c12275l.f24337l = 1;
                        if (interfaceC9427l.isPro(obj, c12275l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj3);
                }
                return Unit.INSTANCE;
        }
    }
}
