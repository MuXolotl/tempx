package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: lَٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14799l {
    public static final C4074l loadAd;
    public static final C4074l yandex;

    static {
        byte[] bArrSmaato = C17423l.smaato("\r\n", AbstractC9050l.yandex);
        yandex = new C4074l(bArrSmaato, 0, bArrSmaato.length);
        loadAd = new C4074l(new byte[]{45, 45});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(InterfaceC9354l interfaceC9354l, C4074l c4074l, AbstractC0283l abstractC0283l) {
        C2791l c2791l;
        if (abstractC0283l instanceof C2791l) {
            c2791l = (C2791l) abstractC0283l;
            int i = c2791l.f6090l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2791l.f6090l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2791l = new C2791l(abstractC0283l);
            }
        } else {
            c2791l = new C2791l(abstractC0283l);
        }
        Object objInmobi = c2791l.f6088l;
        int i2 = c2791l.f6090l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objInmobi);
            c2791l.f6089l = c4074l;
            c2791l.f6090l = 1;
            objInmobi = AbstractC10310l.inmobi(interfaceC9354l, c4074l, c2791l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInmobi == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4074l = c2791l.f6089l;
            AbstractC2829l.crashlytics(objInmobi);
        }
        return new Long(((Boolean) objInmobi).booleanValue() ? c4074l.f8376l.length : 0L);
    }

    public static final void crashlytics(C9987l c9987l, byte[] bArr, byte b) throws IOException {
        int i = c9987l.f20387l;
        if (i >= bArr.length) {
            C18262l.metrica("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        } else {
            c9987l.f20387l = i + 1;
            bArr[i] = b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(C3753l c3753l, AbstractC0283l abstractC0283l) throws Throwable {
        C1667l c1667l;
        Throwable th;
        C16231l c16231l;
        if (abstractC0283l instanceof C1667l) {
            c1667l = (C1667l) abstractC0283l;
            int i = c1667l.f4021l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1667l.f4021l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1667l = new C1667l(abstractC0283l);
            }
        } else {
            c1667l = new C1667l(abstractC0283l);
        }
        Object obj = c1667l.f4019l;
        int i2 = c1667l.f4021l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C16231l c16231l2 = new C16231l();
            try {
                c1667l.f4020l = c16231l2;
                c1667l.f4021l = 1;
                Object objCrashlytics = AbstractC18600l.crashlytics(c3753l, c16231l2, new C9754l((byte) 0, 6), c1667l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objCrashlytics == enumC9342l) {
                    return enumC9342l;
                }
                obj = objCrashlytics;
                c16231l = c16231l2;
            } catch (Throwable th2) {
                th = th2;
                c16231l = c16231l2;
                c16231l.amazon();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c16231l = c1667l.f4020l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c16231l.amazon();
                throw th;
            }
        }
        C14740l c14740l = (C14740l) obj;
        if (c14740l != null) {
            return c14740l;
        }
        throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        if (r5.crashlytics(r6) == r11) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yandex(defpackage.C4074l r19, defpackage.C3753l r20, defpackage.C4993l r21, defpackage.C14740l r22, long r23, defpackage.AbstractC0283l r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14799l.yandex(lّؖ۠, lؕۤۙ, lؗٚۥ, lُؚٔ, long, lّؑۧ):java.lang.Object");
    }
}
