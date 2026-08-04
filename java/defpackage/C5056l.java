package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5056l {
    public final EnumC9931l admob;
    public final float amazon;
    public final C1316l billing;
    public final InterfaceC8714l crashlytics;
    public final InterfaceC2262l loadAd;
    public final C13352l purchase;
    public final Function2 subs;
    public final C5138l yandex;
    public final int mopub = 1;
    public final C4910l isPro = AbstractC8618l.yandex();
    public final C10086l firebase = AbstractC8020l.smaato(null);
    public final C8610l smaato = AbstractC8020l.mopub(new C17921l(this, 0));
    public final C10086l remoteconfig = AbstractC8020l.smaato(new C1187l(0));
    public final C10086l vip = AbstractC8020l.smaato(new C5177l(0));
    public final C10086l metrica = AbstractC8020l.smaato(null);
    public final C10086l startapp = AbstractC8020l.smaato(null);
    public long adcel = 0;
    public final HashSet ads = new HashSet();
    public final C10086l subscription = AbstractC8020l.smaato(null);
    public final C5616l tapsense = new C5616l(new C1187l(0), AbstractC3483l.isPro, null, 12);
    public final C14970l Signature = AbstractC8020l.metrica(new C17921l(this, 1));

    public C5056l(C5138l c5138l, InterfaceC2262l interfaceC2262l, InterfaceC8714l interfaceC8714l, float f, C13352l c13352l, C1316l c1316l, EnumC9931l enumC9931l, Function2 function2) {
        this.yandex = c5138l;
        this.loadAd = interfaceC2262l;
        this.crashlytics = interfaceC8714l;
        this.amazon = f;
        this.purchase = c13352l;
        this.billing = c1316l;
        this.admob = enumC9931l;
        this.subs = function2;
    }

    public static C5371l crashlytics(C5056l c5056l, C8896l c8896l, ArrayList arrayList, EnumC18610l enumC18610l, C3006l c3006l, int i) {
        if ((i & 4) != 0) {
            enumC18610l = EnumC18610l.f36363l;
        }
        Object obj = c3006l;
        if ((i & 8) != 0) {
            obj = C16274l.f31865l;
        }
        c5056l.getClass();
        C12683l c12683l = new C12683l(c5056l, c8896l, obj, 7);
        int iOrdinal = enumC18610l.ordinal();
        Object obj2 = null;
        if (iOrdinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((Boolean) c12683l.invoke(objPrevious)).booleanValue()) {
                    obj2 = objPrevious;
                    break;
                }
            }
            return (C5371l) obj2;
        }
        if (iOrdinal != 1) {
            C18725l.billing();
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((Boolean) c12683l.invoke(obj3)).booleanValue()) {
                obj2 = obj3;
                break;
            }
        }
        return (C5371l) obj2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:15:0x0039, B:71:0x01bf, B:22:0x0051, B:64:0x0152, B:66:0x015c, B:68:0x01a0, B:67:0x0197, B:25:0x0062, B:60:0x0124), top: B:79:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0197 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:15:0x0039, B:71:0x01bf, B:22:0x0051, B:64:0x0152, B:66:0x015c, B:68:0x01a0, B:67:0x0197, B:25:0x0062, B:60:0x0124), top: B:79:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bc, code lost:
    
        if (defpackage.AbstractC15342l.billing(1000, r1, r2) == r9) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object loadAd(defpackage.C5056l r15, defpackage.C5371l r16, defpackage.C5371l r17, defpackage.AbstractC0283l r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5056l.loadAd(lٟؗ, lؘؑۧ, lؘؑۧ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02be, code lost:
    
        if (r11.yandex() > r1.yandex()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02cd, code lost:
    
        if (r11.yandex() < r1.yandex()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02cf, code lost:
    
        r0 = defpackage.AbstractC10999l.mopub(r8.loadAd, null, 0, new defpackage.C9180l(r8, r1, r11, null, 0), 3);
        r3.billing(null);
        r2.f7255l = null;
        r2.f7254l = null;
        r2.f7253l = 2;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ef, code lost:
    
        if (r0.mo2158switch(r2) != r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f5, code lost:
    
        r3.billing(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02fa, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r1.yandex() == r9.yandex()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r1.yandex() == ((defpackage.C5866l) r3.f11181l).purchase.loadAd.admob()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        r14.billing(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yandex(defpackage.C5056l r21, defpackage.EnumC18610l r22, defpackage.AbstractC0283l r23) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5056l.yandex(lٟؗ, l۠ؓ, lّؑۧ):java.lang.Object");
    }

    public final long admob(long j) {
        ((C1644l) this.yandex.m1707abstract().f25776l).getClass();
        int iOrdinal = billing().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C18725l.billing();
                return 0L;
            }
            int iOrdinal2 = this.admob.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    C18725l.billing();
                    return 0L;
                }
                int iOrdinal3 = EnumC7283l.f15125l.ordinal();
                if (iOrdinal3 == 0) {
                    return AbstractC2296l.yandex(C1187l.purchase(j), -C1187l.billing(j));
                }
                if (iOrdinal3 == 1) {
                    return AbstractC2296l.yandex(-C1187l.purchase(j), C1187l.billing(j));
                }
                C18725l.billing();
                return 0L;
            }
        }
        return j;
    }

    public final C5371l amazon() {
        Object value = this.firebase.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        for (Object obj2 : this.yandex.m1707abstract().subscription()) {
            if (((C5371l) obj2).yandex.firebase.equals(value)) {
                obj = obj2;
                break;
            }
        }
        return (C5371l) obj;
    }

    public final EnumC7283l billing() {
        return this.yandex.m1707abstract().vip();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mopub(Object obj, long j, AbstractC0283l abstractC0283l) {
        C18596l c18596l;
        Object next;
        C5371l c5371l;
        long j2;
        if (abstractC0283l instanceof C18596l) {
            c18596l = (C18596l) abstractC0283l;
            int i = c18596l.f36321l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18596l.f36321l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18596l = new C18596l(this, abstractC0283l);
            }
        } else {
            c18596l = new C18596l(this, abstractC0283l);
        }
        Object obj2 = c18596l.f36320l;
        int i2 = c18596l.f36321l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            C5138l c5138l = this.yandex;
            Iterator it = c5138l.m1707abstract().subscription().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C5371l) next).yandex.firebase.equals(obj));
            c5371l = (C5371l) next;
            if (c5371l != null) {
                long jLoadAd = c5371l.loadAd();
                int iOrdinal = billing().ordinal();
                if (iOrdinal == 0) {
                    j2 = jLoadAd & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        C18725l.billing();
                        return null;
                    }
                    j2 = jLoadAd >> 32;
                }
                int i3 = (int) j2;
                if (i3 < 0) {
                    C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
                    c18596l.f36323l = this;
                    c18596l.f36322l = obj;
                    c18596l.f36325l = c5371l;
                    c18596l.f36319l = j;
                    c18596l.f36321l = 1;
                    Object objMopub = AbstractC16817l.mopub((C5866l) c5138l.f11181l, i3, c13315lAdmob, c18596l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objMopub == enumC9342l) {
                        return enumC9342l;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = c18596l.f36319l;
        C5371l c5371l2 = c18596l.f36325l;
        obj = c18596l.f36322l;
        C5056l c5056l = c18596l.f36323l;
        AbstractC2829l.crashlytics(obj2);
        c5371l = c5371l2;
        this = c5056l;
        this.firebase.setValue(obj);
        this.vip.setValue(new C5177l(c5371l.loadAd()));
        this.adcel = j;
        return Unit.INSTANCE;
    }

    public final long purchase() {
        long jLoadAd;
        C5371l c5371lAmazon = amazon();
        if (c5371lAmazon == null) {
            return 0L;
        }
        int iYandex = c5371lAmazon.yandex();
        C10086l c10086l = this.metrica;
        Integer num = (Integer) c10086l.getValue();
        C10086l c10086l2 = this.startapp;
        if (num == null || iYandex != num.intValue() || ((Integer) c10086l.getValue()) == null) {
            c10086l.setValue(null);
            c10086l2.setValue(null);
            jLoadAd = c5371lAmazon.loadAd();
        } else {
            C5177l c5177l = (C5177l) c10086l2.getValue();
            jLoadAd = c5177l != null ? c5177l.yandex : c5371lAmazon.loadAd();
        }
        long j = ((C1187l) this.remoteconfig.getValue()).yandex;
        long j2 = ((C5177l) this.vip.getValue()).yandex;
        long jAdmob = admob(C1187l.admob(AbstractC2296l.yandex((int) (j2 >> 32), (int) (j2 & 4294967295L)), AbstractC2296l.yandex((int) (jLoadAd >> 32), (int) (jLoadAd & 4294967295L))));
        subs(jAdmob);
        return C1187l.subs(j, jAdmob);
    }

    public final long subs(long j) {
        int iOrdinal = this.admob.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return j;
        }
        C18725l.billing();
        return 0L;
    }
}
