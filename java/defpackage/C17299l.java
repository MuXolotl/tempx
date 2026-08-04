package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lٗٞۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17299l extends AbstractC0294l {
    public final C7119l admob;
    public final C15053l mopub;
    public C7504l subs;

    public C17299l(C4154l c4154l, C15053l c15053l, C11491l c11491l, InterfaceC13490l interfaceC13490l) {
        super(c4154l, c11491l, interfaceC13490l);
        this.mopub = c15053l;
        this.admob = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static final Object m4299class(C17299l c17299l, C10700l c10700l, C13250l c13250l, C4154l c4154l, C10700l c10700l2, long j, AbstractC0283l abstractC0283l) {
        C10179l c10179l;
        C13250l c13250l2;
        C4154l c4154l2;
        C10700l c10700l3;
        boolean z;
        if (abstractC0283l instanceof C10179l) {
            c10179l = (C10179l) abstractC0283l;
            int i = c10179l.f20739l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10179l.f20739l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10179l = new C10179l(abstractC0283l);
            }
        } else {
            c10179l = new C10179l(abstractC0283l);
        }
        Object objAdmob = c10179l.f20742l;
        int i2 = c10179l.f20739l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C8912l c8912l = new C8912l(c17299l, interfaceC14029l, 20);
            c10179l.f20741l = c17299l;
            c10179l.f20740l = c10700l;
            c10179l.f20743l = c13250l;
            c10179l.f20737l = c4154l;
            c10179l.f20738l = c10700l2;
            c10179l.f20739l = 1;
            objAdmob = AbstractC15342l.admob(j, c8912l, c10179l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
            c13250l2 = c13250l;
            c4154l2 = c4154l;
            c10700l3 = c10700l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C10700l c10700l4 = c10179l.f20738l;
            C4154l c4154l3 = c10179l.f20737l;
            c13250l2 = c10179l.f20743l;
            C10700l c10700l5 = c10179l.f20740l;
            C17299l c17299l2 = c10179l.f20741l;
            AbstractC2829l.crashlytics(objAdmob);
            c10700l3 = c10700l4;
            c4154l2 = c4154l3;
            c10700l = c10700l5;
            c17299l = c17299l2;
        }
        C13835l c13835l = (C13835l) objAdmob;
        if (c13835l != null) {
            boolean z2 = ((C13835l) c10700l.f21708l).crashlytics;
            long j2 = c13835l.yandex;
            c10700l.f21708l = new C13835l(j2, c13835l.loadAd, z2);
            c13250l2.f26029l = c4154l2.isPro(c4154l2.billing(j2));
            c10700l3.f21708l = AbstractC15042l.yandex(0.0f, 0.0f, 30);
            C0458l c0458l = (C0458l) c17299l.billing;
            long j3 = c13835l.loadAd;
            long j4 = c13835l.yandex;
            ((C13507l) c0458l.f1691l).yandex(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((C13507l) c0458l.f1690l).yandex(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !AbstractC7902l.yandex(c13250l2.f26029l);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0165, code lost:
    
        if (r0.invoke(r1, r10) == r2) goto L40;
     */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m4300continue(defpackage.C17299l r19, defpackage.C4154l r20, defpackage.C13835l r21, float r22, float r23, defpackage.AbstractC0283l r24) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17299l.m4300continue(lٗٞۙ, lٖؖٓ, lْۣۨ, float, float, lّؑۧ):java.lang.Object");
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static C13835l m4301default(C7119l c7119l) {
        C13835l c13835l = null;
        C11129l c11129lPurchase = AbstractC6900l.purchase(new amazon(new C3379l(c7119l, 0), 0 == true ? 1 : 0, 3));
        while (c11129lPurchase.hasNext()) {
            C13835l c13835lYandex = (C13835l) c11129lPurchase.next();
            if (c13835l != null) {
                c13835lYandex = c13835l.yandex(c13835lYandex);
            }
            c13835l = c13835lYandex;
        }
        return c13835l;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final float m4302interface(C15222l c15222l, float f) {
        C4154l c4154l = (C4154l) this.loadAd;
        long jSubs = c4154l.subs(c4154l.purchase(f));
        C4154l c4154l2 = c15222l.yandex;
        return c4154l.admob(c4154l.billing(c4154l2.amazon(c4154l2.firebase, jSubs, 1)));
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final boolean m4303static(C9185l c9185l) {
        long j;
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) this.amazon;
        C15053l c15053l = this.mopub;
        ViewConfiguration viewConfiguration = (ViewConfiguration) c15053l.f29576l;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? AbstractC11829l.purchase(viewConfiguration) : interfaceC13490l.mo868instanceof(64.0f));
        float f2 = -(i > 26 ? AbstractC11829l.loadAd(viewConfiguration) : interfaceC13490l.mo868instanceof(64.0f));
        List list = c9185l.yandex;
        C1187l c1187l = new C1187l(0L);
        int size = list.size();
        boolean zAmazon = false;
        int i2 = 0;
        while (true) {
            j = c1187l.yandex;
            if (i2 >= size) {
                break;
            }
            c1187l = new C1187l(C1187l.subs(j, ((C15730l) list.get(i2)).isPro));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        C4154l c4154l = (C4154l) this.loadAd;
        float fIsPro = c4154l.isPro(c4154l.billing(jFloatToRawIntBits));
        if (fIsPro != 0.0f) {
            InterfaceC17955l interfaceC17955l = c4154l.yandex;
            zAmazon = fIsPro > 0.0f ? interfaceC17955l.amazon() : interfaceC17955l.crashlytics();
        }
        if (!zAmazon) {
            return this.crashlytics;
        }
        long j2 = ((C15730l) AbstractC16901l.m4231native(c9185l.yandex)).loadAd;
        c15053l.getClass();
        return !(this.admob.amazon(new C13835l(jFloatToRawIntBits, j2, false)) instanceof C15230l);
    }
}
