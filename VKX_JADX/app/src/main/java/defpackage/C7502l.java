package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7502l implements InterfaceC17443l, InterfaceC9526l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f15509l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f15510l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f15511l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f15512l;

    public C7502l(C12676l c12676l) {
        if (c12676l == null) {
            C6541l.subs("params == null");
            throw null;
        }
        this.f15511l = c12676l;
        int i = c12676l.loadAd;
        this.f15510l = new C14785l(i, (Cfor) c12676l.purchase);
        this.f15509l = new byte[i];
        this.f15512l = new byte[i];
    }

    public InterfaceC2167l admob(C5181l c5181l) {
        InterfaceC2167l interfaceC2167lPurchase = InterfaceC2167l.f4805l;
        Iterator itTapsense = c5181l.tapsense();
        while (itTapsense.hasNext()) {
            interfaceC2167lPurchase = ((C17516l) this.f15510l).purchase(this, c5181l.pro(((Integer) itTapsense.next()).intValue()));
            if (interfaceC2167lPurchase instanceof C11926l) {
                break;
            }
        }
        return interfaceC2167lPurchase;
    }

    public byte[] amazon(byte[] bArr, C13068l c13068l) {
        C13549l c13549l = new C13549l(1);
        c13549l.crashlytics = c13068l.yandex;
        c13549l.loadAd = c13068l.loadAd;
        c13549l.purchase = c13068l.purchase;
        return ((C14785l) this.f15510l).mopub(bArr, new C13068l(c13549l).yandex());
    }

    public InterfaceC2167l billing(InterfaceC2167l interfaceC2167l) {
        return ((C17516l) this.f15510l).purchase(this, interfaceC2167l);
    }

    @Override // defpackage.InterfaceC9526l
    public /* synthetic */ ListenableFuture call() {
        C18289l c18289l = (C18289l) this.f15511l;
        int i = 0;
        C9496l c9496l = new C9496l(c18289l, i);
        ListenableFuture listenableFuture = (ListenableFuture) this.f15510l;
        EnumC1535l enumC1535l = EnumC1535l.f3808l;
        C18012l c18012lAdmob = AbstractC7151l.admob(listenableFuture, c9496l, enumC1535l);
        C18012l c18012lAdmob2 = AbstractC7151l.admob(c18012lAdmob, (C3013l) this.f15509l, (Executor) this.f15512l);
        return AbstractC7151l.admob(c18012lAdmob2, AbstractC6854l.loadAd(new C13610l(c18289l, c18012lAdmob, c18012lAdmob2, i)), enumC1535l);
    }

    public AbstractC4350l crashlytics(InterfaceC1388l interfaceC1388l, String str) {
        AbstractC4350l abstractC4350l;
        AbstractC4350l abstractC4350lPurchase;
        C6478l c6478l;
        AbstractC6475l abstractC6475l;
        synchronized (((C6760l) this.f15512l)) {
            try {
                abstractC4350l = (AbstractC4350l) ((C15018l) this.f15511l).yandex.get(str);
                if (interfaceC1388l.mo886strictfp(abstractC4350l)) {
                    InterfaceC11893l interfaceC11893l = (InterfaceC11893l) this.f15510l;
                    if ((interfaceC11893l instanceof C6478l) && (abstractC6475l = (c6478l = (C6478l) interfaceC11893l).f13532l) != null) {
                        AbstractC2387l.amazon(abstractC4350l, c6478l.f13531l, abstractC6475l);
                    }
                } else {
                    C3806l c3806l = new C3806l((AbstractC6626l) this.f15509l);
                    c3806l.yandex(AbstractC7237l.yandex, str);
                    InterfaceC11893l interfaceC11893l2 = (InterfaceC11893l) this.f15510l;
                    try {
                        try {
                            abstractC4350lPurchase = interfaceC11893l2.isPro(interfaceC1388l, c3806l);
                        } catch (AbstractMethodError unused) {
                            abstractC4350lPurchase = interfaceC11893l2.mopub(((InterfaceC13937l) interfaceC1388l).mo1730private(), c3806l);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC4350lPurchase = interfaceC11893l2.purchase(((InterfaceC13937l) interfaceC1388l).mo1730private());
                    }
                    abstractC4350l = abstractC4350lPurchase;
                    AbstractC4350l abstractC4350l2 = (AbstractC4350l) ((C15018l) this.f15511l).yandex.put(str, abstractC4350l);
                    if (abstractC4350l2 != null) {
                        abstractC4350l2.yandex();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC4350l;
    }

    public boolean firebase(String str) {
        if (((HashMap) this.f15509l).containsKey(str)) {
            return true;
        }
        C7502l c7502l = (C7502l) this.f15511l;
        if (c7502l != null) {
            return c7502l.firebase(str);
        }
        return false;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C1381l((Executor) ((InterfaceC15897l) this.f15511l).get(), (C16163l) ((InterfaceC15897l) this.f15510l).get(), (C10111l) ((C12418l) this.f15509l).get(), (C16163l) ((InterfaceC15897l) this.f15512l).get());
    }

    public C7502l isPro() {
        return new C7502l(this, (C17516l) this.f15510l);
    }

    public C5321l loadAd(C13068l c13068l) {
        C12676l c12676l = (C12676l) this.f15511l;
        byte[][] bArr = new byte[c12676l.amazon][];
        int i = 0;
        while (true) {
            int i2 = c12676l.amazon;
            if (i >= i2) {
                return new C5321l(c12676l, bArr);
            }
            C13549l c13549l = new C13549l(1);
            c13549l.crashlytics = c13068l.yandex;
            c13549l.loadAd = c13068l.loadAd;
            c13549l.purchase = c13068l.purchase;
            c13549l.billing = i;
            c13549l.mopub = c13068l.mopub;
            c13549l.amazon = c13068l.amazon;
            c13068l = new C13068l(c13549l);
            if (i < 0 || i >= i2) {
                C8339l.metrica("index out of bounds");
                return null;
            }
            bArr[i] = yandex(((C14785l) this.f15510l).mopub((byte[]) this.f15509l, AbstractC4047l.smaato(32, i)), c12676l.crashlytics - 1, c13068l);
            i++;
        }
    }

    public void mopub(C11421l c11421l, Object obj, C16979l c16979l) {
        C12110l c12110l = (C12110l) ((HashMap) this.f15511l).get(c11421l);
        if (c12110l != null) {
            c12110l.yandex(c11421l, obj, c16979l);
        } else {
            ((C12110l) this.f15509l).yandex(c11421l, obj, c16979l);
        }
    }

    public void purchase(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = ((C12676l) this.f15511l).loadAd;
        if (length != i) {
            C8339l.metrica("size of secretKeySeed needs to be equal to size of digest");
            return;
        }
        if (bArr2 == null) {
            C6541l.subs("publicSeed == null");
        } else if (bArr2.length != i) {
            C8339l.metrica("size of publicSeed needs to be equal to size of digest");
        } else {
            this.f15509l = bArr;
            this.f15512l = bArr2;
        }
    }

    public void remoteconfig(String str, InterfaceC2167l interfaceC2167l) {
        if (((HashMap) this.f15512l).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f15509l;
        if (interfaceC2167l == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2167l);
        }
    }

    public void smaato(String str, InterfaceC2167l interfaceC2167l) {
        C7502l c7502l;
        HashMap map = (HashMap) this.f15509l;
        if (!map.containsKey(str) && (c7502l = (C7502l) this.f15511l) != null && c7502l.firebase(str)) {
            c7502l.smaato(str, interfaceC2167l);
        } else {
            if (((HashMap) this.f15512l).containsKey(str)) {
                return;
            }
            if (interfaceC2167l == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC2167l);
            }
        }
    }

    public void subs(C11421l c11421l, Iterator it, C16979l c16979l) {
        C6851l c6851l = (C6851l) ((HashMap) this.f15510l).get(c11421l);
        if (c6851l != null) {
            c6851l.yandex(c11421l, it, c16979l);
            return;
        }
        C6851l c6851l2 = (C6851l) this.f15512l;
        if (c6851l2 != null && !((HashMap) this.f15511l).containsKey(c11421l)) {
            c6851l2.yandex(c11421l, it, c16979l);
        } else {
            while (it.hasNext()) {
                mopub(c11421l, it.next(), c16979l);
            }
        }
    }

    public InterfaceC2167l vip(String str) {
        HashMap map = (HashMap) this.f15509l;
        if (map.containsKey(str)) {
            return (InterfaceC2167l) map.get(str);
        }
        C7502l c7502l = (C7502l) this.f15511l;
        if (c7502l != null) {
            return c7502l.vip(str);
        }
        C8339l.metrica(AbstractC12900l.firebase(str, " is not defined"));
        return null;
    }

    public byte[] yandex(byte[] bArr, int i, C13068l c13068l) {
        C14785l c14785l = (C14785l) this.f15510l;
        C12676l c12676l = (C12676l) this.f15511l;
        int i2 = c12676l.loadAd;
        if (bArr.length != i2) {
            C8339l.metrica(AbstractC15560l.tapsense("startHash needs to be ", i2, "bytes"));
            return null;
        }
        c13068l.yandex();
        if (i > c12676l.crashlytics - 1) {
            C8339l.metrica("max chain length must not be greater than w");
            return null;
        }
        if (i == 0) {
            return bArr;
        }
        byte[] bArrYandex = yandex(bArr, i - 1, c13068l);
        C13549l c13549l = new C13549l(1);
        c13549l.crashlytics = c13068l.yandex;
        c13549l.loadAd = c13068l.loadAd;
        c13549l.purchase = c13068l.purchase;
        c13549l.billing = c13068l.billing;
        c13549l.mopub = i - 1;
        c13549l.amazon = 0;
        C13068l c13068l2 = new C13068l(c13549l);
        byte[] bArrMopub = c14785l.mopub((byte[]) this.f15512l, c13068l2.yandex());
        C13549l c13549l2 = new C13549l(1);
        c13549l2.crashlytics = c13068l2.yandex;
        c13549l2.loadAd = c13068l2.loadAd;
        c13549l2.purchase = c13068l2.purchase;
        c13549l2.billing = c13068l2.billing;
        c13549l2.mopub = c13068l2.mopub;
        c13549l2.amazon = 1;
        byte[] bArrMopub2 = c14785l.mopub((byte[]) this.f15512l, new C13068l(c13549l2).yandex());
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArrYandex[i3] ^ bArrMopub2[i3]);
        }
        int length = bArrMopub.length;
        int i4 = c14785l.f28908l;
        if (length != i4) {
            C8339l.metrica("wrong key length");
            return null;
        }
        if (i2 == i4) {
            return c14785l.subs(bArrMopub, 0, bArr2);
        }
        C8339l.metrica("wrong in length");
        return null;
    }

    public C7502l(C15980l c15980l) {
        this.f15510l = null;
        this.f15509l = null;
        this.f15512l = null;
        this.f15511l = c15980l;
    }

    public /* synthetic */ C7502l(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15511l = obj;
        this.f15510l = obj2;
        this.f15509l = obj3;
        this.f15512l = obj4;
    }

    public C7502l(C7502l c7502l, C17516l c17516l) {
        this.f15509l = new HashMap();
        this.f15512l = new HashMap();
        this.f15511l = c7502l;
        this.f15510l = c17516l;
    }

    public C7502l(C15018l c15018l, InterfaceC11893l interfaceC11893l, AbstractC6626l abstractC6626l) {
        this.f15511l = c15018l;
        this.f15510l = interfaceC11893l;
        this.f15509l = abstractC6626l;
        this.f15512l = new C6760l(11);
    }
}
