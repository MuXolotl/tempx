package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15215l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f29810l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29811l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29812l;

    public C15215l(C9879l c9879l, InterfaceC2262l interfaceC2262l, C11644l c11644l) {
        this.f29812l = 0;
        this.f29811l = c9879l;
        this.f29810l = c11644l;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0300  */
    /* JADX WARN: Code duplicated, block: B:209:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:273:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:294:0x051d  */
    /* JADX WARN: Code duplicated, block: B:319:0x0588  */
    /* JADX WARN: Code duplicated, block: B:338:0x05d3  */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0505, code lost:
    
        if (r2.isPro(r0, r3) == r4) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x056a, code lost:
    
        if (r1.isPro(r0, r3) == r4) goto L309;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [lّۢٚ, lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v39 */
    @Override // defpackage.InterfaceC9427l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object isPro(java.lang.Object r23, defpackage.InterfaceC14029l r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15215l.isPro(java.lang.Object, lٌؚٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object loadAd(C18554l c18554l, InterfaceC14029l interfaceC14029l) {
        C1422l c1422l;
        C11644l c11644l = (C11644l) this.f29810l;
        C9879l c9879l = (C9879l) this.f29811l;
        if (interfaceC14029l instanceof C1422l) {
            c1422l = (C1422l) interfaceC14029l;
            int i = c1422l.f3598l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1422l.f3598l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1422l = new C1422l(this, interfaceC14029l);
            }
        } else {
            c1422l = new C1422l(this, interfaceC14029l);
        }
        Object obj = c1422l.f3597l;
        int i2 = c1422l.f3598l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            AbstractC18643l abstractC18643l = c9879l.isPro().loadAd;
            if (!(abstractC18643l instanceof C4167l)) {
                ((C10086l) c11644l.f23357l).setValue(null);
                AppActivity appActivity = c9879l.yandex;
                c1422l.f3598l = 1;
                Object objM3138l = C11644l.m3138l(c11644l, appActivity, abstractC18643l, c18554l, c1422l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM3138l == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object yandex(int i, InterfaceC14029l interfaceC14029l) {
        C11664l c11664l;
        if (interfaceC14029l instanceof C11664l) {
            c11664l = (C11664l) interfaceC14029l;
            int i2 = c11664l.f23378l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11664l.f23378l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11664l = new C11664l(this, interfaceC14029l);
            }
        } else {
            c11664l = new C11664l(this, interfaceC14029l);
        }
        Object obj = c11664l.f23377l;
        int i3 = c11664l.f23378l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (i > 0) {
                C9122l c9122l = (C9122l) this.f29811l;
                if (!c9122l.f18750l) {
                    c9122l.f18750l = true;
                    InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f29810l;
                    c11664l.f23378l = 1;
                    Object objIsPro = interfaceC9427l.isPro(EnumC0920l.f2595l, c11664l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objIsPro == enumC9342l) {
                        return enumC9342l;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15215l(Object obj, Object obj2, int i) {
        this.f29812l = i;
        this.f29811l = obj;
        this.f29810l = obj2;
    }
}
