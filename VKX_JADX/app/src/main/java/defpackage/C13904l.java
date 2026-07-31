package defpackage;

import android.os.Handler;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lِٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13904l implements InterfaceC10367l, InterfaceC5788l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f27199l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f27200l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f27201l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27202l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f27203l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f27204l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f27205l;

    public C13904l(InterfaceC5788l interfaceC5788l, InterfaceC16922l interfaceC16922l, InterfaceC16922l interfaceC16922l2, byte[] bArr) {
        this.f27202l = 2;
        this.f27204l = interfaceC5788l;
        this.f27203l = interfaceC16922l2;
        this.f27201l = ((interfaceC16922l2 instanceof InterfaceC11512l) && (interfaceC16922l2 instanceof InterfaceC9273l)) ? ((InterfaceC9273l) interfaceC16922l2).getByteLength() - 1 : Alert.DURATION_SHOW_INDEFINITELY;
        byte[] bArr2 = new byte[interfaceC16922l.getDigestSize()];
        this.f27205l = bArr2;
        interfaceC16922l.reset();
        if (bArr != null) {
            interfaceC16922l.update(bArr, 0, bArr.length);
        }
        interfaceC16922l.doFinal(bArr2, 0);
    }

    private final void subs() {
        ArrayList arrayList;
        synchronized (this.f27204l) {
            try {
                this.f27199l = true;
                arrayList = new ArrayList(((C11154l) this.f27203l).values());
                ((C11154l) this.f27203l).clear();
                if (((RunnableC7853l) this.f27205l) != null) {
                    Handler handler = (Handler) this.f27200l;
                    handler.getClass();
                    handler.post((RunnableC7853l) this.f27205l);
                    this.f27205l = null;
                    this.f27200l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C14784l) it.next()).adcel();
        }
    }

    public void admob() {
        switch (this.f27202l) {
            case 4:
                subs();
                return;
            default:
                synchronized (this.f27204l) {
                    try {
                        if (this.f27199l) {
                            return;
                        }
                        this.f27199l = true;
                        C7504l c7504l = (C7504l) this.f27200l;
                        InterfaceC14029l interfaceC14029l = null;
                        if (c7504l != null) {
                            c7504l.ads(null);
                        }
                        this.f27200l = null;
                        Unit unit = Unit.INSTANCE;
                        AbstractC10999l.mopub((InterfaceC2262l) this.f27203l, null, 0, new C5472l(this, interfaceC14029l, 2), 3);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    @Override // defpackage.InterfaceC10367l
    public void amazon(Executor executor, InterfaceC15984l interfaceC15984l) {
        RunnableC8661l runnableC8661l;
        synchronized (this.f27204l) {
            isPro(interfaceC15984l);
            runnableC8661l = new RunnableC8661l((AtomicReference) this.f27203l, executor, interfaceC15984l);
            ((HashMap) this.f27205l).put(interfaceC15984l, runnableC8661l);
            ((CopyOnWriteArraySet) this.f27200l).add(runnableC8661l);
        }
        runnableC8661l.yandex(0);
    }

    public int billing() {
        int i;
        synchronized (this.f27204l) {
            i = this.f27201l;
            this.f27201l = i + 1;
        }
        return i;
    }

    public C14784l crashlytics(Object obj) {
        C14784l c14784l;
        synchronized (this.f27204l) {
            try {
                int iBilling = billing();
                c14784l = new C14784l(iBilling, obj);
                if (this.f27199l) {
                    c14784l.adcel();
                } else {
                    ((C11154l) this.f27203l).put(Integer.valueOf(iBilling), c14784l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14784l;
    }

    public void firebase(int i, Object obj) {
        synchronized (this.f27204l) {
            try {
                C14784l c14784l = (C14784l) ((C11154l) this.f27203l).remove(Integer.valueOf(i));
                if (c14784l != null) {
                    if (c14784l.f28906l.getClass() == obj.getClass()) {
                        c14784l.smaato(obj);
                    } else {
                        AbstractC6427l.vip("SequencedFutureManager", "Type mismatch, expected " + c14784l.f28906l.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((RunnableC7853l) this.f27205l) != null && ((C11154l) this.f27203l).isEmpty()) {
                    admob();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5788l
    public int getInputBlockSize() {
        int inputBlockSize = ((InterfaceC5788l) this.f27204l).getInputBlockSize();
        return this.f27199l ? (inputBlockSize - 1) - (((byte[]) this.f27205l).length * 2) : inputBlockSize;
    }

    @Override // defpackage.InterfaceC5788l
    public int getOutputBlockSize() {
        int outputBlockSize = ((InterfaceC5788l) this.f27204l).getOutputBlockSize();
        return this.f27199l ? outputBlockSize : (outputBlockSize - 1) - (((byte[]) this.f27205l).length * 2);
    }

    @Override // defpackage.InterfaceC5788l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        SecureRandom secureRandom = null;
        SecureRandom secureRandomLoadAd = interfaceC9719l instanceof C6114l ? ((C6114l) interfaceC9719l).f12904l : null;
        if (z) {
            if (secureRandomLoadAd == null) {
                secureRandomLoadAd = AbstractC8776l.loadAd();
            } else {
                ThreadLocal threadLocal = AbstractC8776l.yandex;
            }
            secureRandom = secureRandomLoadAd;
        }
        this.f27200l = secureRandom;
        this.f27199l = z;
        ((InterfaceC5788l) this.f27204l).init(z, interfaceC9719l);
    }

    public void isPro(InterfaceC15984l interfaceC15984l) {
        RunnableC8661l runnableC8661l = (RunnableC8661l) ((HashMap) this.f27205l).remove(interfaceC15984l);
        if (runnableC8661l != null) {
            runnableC8661l.f17840l.set(false);
            ((CopyOnWriteArraySet) this.f27200l).remove(runnableC8661l);
        }
    }

    public C13568l loadAd() {
        AbstractC1051l.crashlytics(((InterfaceC11545l) this.f27204l) != null, "Must set register function");
        AbstractC1051l.crashlytics(((InterfaceC11545l) this.f27203l) != null, "Must set unregister function");
        AbstractC1051l.crashlytics(((C18096l) this.f27205l) != null, "Must set holder");
        C12648l c12648l = (C12648l) ((C18096l) this.f27205l).loadAd;
        AbstractC1051l.isPro(c12648l, "Key must not be null");
        return new C13568l(new C1196l(this, (C18096l) this.f27205l, (C9138l[]) this.f27200l, this.f27199l, this.f27201l), new C17516l(this, c12648l), 12);
    }

    @Override // defpackage.InterfaceC10367l
    public ListenableFuture mopub() {
        Object obj = ((AtomicReference) this.f27203l).get();
        return obj instanceof AbstractC3675l ? new C11077l(1, null) : AbstractC11356l.mopub(obj);
    }

    @Override // defpackage.InterfaceC5788l
    public byte[] processBlock(byte[] bArr, int i, int i2) throws C10352l {
        InterfaceC5788l interfaceC5788l = (InterfaceC5788l) this.f27204l;
        InterfaceC16922l interfaceC16922l = (InterfaceC16922l) this.f27203l;
        byte[] bArr2 = (byte[]) this.f27205l;
        if (this.f27199l) {
            int inputBlockSize = getInputBlockSize();
            if (i2 > inputBlockSize) {
                C10754l.ad("input data too long");
                return null;
            }
            int length = (bArr2.length * 2) + inputBlockSize + 1;
            byte[] bArr3 = new byte[length];
            int i3 = length - i2;
            System.arraycopy(bArr, i, bArr3, i3, i2);
            bArr3[i3 - 1] = 1;
            System.arraycopy(bArr2, 0, bArr3, bArr2.length, bArr2.length);
            int length2 = bArr2.length;
            byte[] bArr4 = new byte[length2];
            ((SecureRandom) this.f27200l).nextBytes(bArr4);
            System.arraycopy(bArr4, 0, bArr3, 0, bArr2.length);
            interfaceC16922l.reset();
            purchase(bArr4, 0, length2, bArr3, bArr2.length, length - bArr2.length);
            purchase(bArr3, bArr2.length, length - bArr2.length, bArr3, 0, bArr2.length);
            return interfaceC5788l.processBlock(bArr3, 0, length);
        }
        int outputBlockSize = getOutputBlockSize();
        int outputBlockSize2 = interfaceC5788l.getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize2];
        byte[] bArrProcessBlock = interfaceC5788l.processBlock(bArr, i, i2);
        int length3 = (outputBlockSize | (outputBlockSize2 - bArrProcessBlock.length)) >> 31;
        int iMin = Math.min(outputBlockSize2, bArrProcessBlock.length);
        System.arraycopy(bArrProcessBlock, 0, bArr5, outputBlockSize2 - iMin, iMin);
        Arrays.fill(bArrProcessBlock, (byte) 0);
        interfaceC16922l.reset();
        purchase(bArr5, bArr2.length, outputBlockSize2 - bArr2.length, bArr5, 0, bArr2.length);
        purchase(bArr5, 0, bArr2.length, bArr5, bArr2.length, outputBlockSize2 - bArr2.length);
        for (int i4 = 0; i4 != bArr2.length; i4++) {
            length3 |= bArr2[i4] ^ bArr5[bArr2.length + i4];
        }
        int i5 = -1;
        for (int length4 = bArr2.length * 2; length4 != outputBlockSize2; length4++) {
            i5 += (((-(bArr5[length4] & 255)) & i5) >> 31) & length4;
        }
        if (((i5 >> 31) | length3 | (bArr5[i5 + 1] ^ 1)) != 0) {
            Arrays.fill(bArr5, (byte) 0);
            C11467l.remoteconfig("data wrong");
            return null;
        }
        int i6 = i5 + 2;
        int i7 = outputBlockSize2 - i6;
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArr5, i6, bArr6, 0, i7);
        Arrays.fill(bArr5, (byte) 0);
        return bArr6;
    }

    public void purchase(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        InterfaceC16922l interfaceC16922l = (InterfaceC16922l) this.f27203l;
        int digestSize = interfaceC16922l.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        int i6 = i4 + i3;
        int i7 = i6 - digestSize;
        interfaceC16922l.update(bArr, i, i2);
        if (i2 > this.f27201l) {
            InterfaceC11512l interfaceC11512l = (InterfaceC11512l) interfaceC16922l;
            InterfaceC11512l interfaceC11512lYandex = interfaceC11512l.yandex();
            i5 = 0;
            while (i3 < i7) {
                AbstractC10000l.isPro(i5, 0, bArr4);
                interfaceC16922l.update(bArr4, 0, 4);
                interfaceC16922l.doFinal(bArr3, 0);
                interfaceC11512l.loadAd(interfaceC11512lYandex);
                AbstractC15269l.billing(bArr3, digestSize, 0, bArr2, i3);
                i3 += digestSize;
                i5++;
            }
        } else {
            int i8 = 0;
            while (i3 < i7) {
                AbstractC10000l.isPro(i8, 0, bArr4);
                interfaceC16922l.update(bArr4, 0, 4);
                interfaceC16922l.doFinal(bArr3, 0);
                interfaceC16922l.update(bArr, i, i2);
                AbstractC15269l.billing(bArr3, digestSize, 0, bArr2, i3);
                i3 += digestSize;
                i8++;
            }
            i5 = i8;
        }
        AbstractC10000l.isPro(i5, 0, bArr4);
        interfaceC16922l.update(bArr4, 0, 4);
        interfaceC16922l.doFinal(bArr3, 0);
        AbstractC15269l.billing(bArr3, i6 - i3, 0, bArr2, i3);
    }

    @Override // defpackage.InterfaceC10367l
    public void remoteconfig(InterfaceC15984l interfaceC15984l) {
        synchronized (this.f27204l) {
            isPro(interfaceC15984l);
        }
    }

    public void smaato(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f27204l) {
            try {
                if (Objects.equals(((AtomicReference) this.f27203l).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.f27201l + 1;
                this.f27201l = i2;
                if (this.f27199l) {
                    return;
                }
                this.f27199l = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f27200l).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((RunnableC8661l) it2.next()).yandex(i2);
                    } else {
                        synchronized (this.f27204l) {
                            try {
                                if (this.f27201l == i2) {
                                    this.f27199l = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f27200l).iterator();
                                    i = this.f27201l;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean yandex(int i, int i2) {
        C17893l c17893l = (C17893l) this.f27203l;
        int i3 = this.f27201l;
        InterfaceC13112l interfaceC13112l = (InterfaceC13112l) c17893l.f34848l[i + i3];
        InterfaceC13112l interfaceC13112l2 = (InterfaceC13112l) ((C17893l) this.f27205l).f34848l[i3 + i2];
        return AbstractC8576l.yandex(interfaceC13112l, interfaceC13112l2) || interfaceC13112l.getClass() == interfaceC13112l2.getClass();
    }

    public C13904l(InterfaceC2262l interfaceC2262l, Ctry ctry) {
        this.f27202l = 5;
        this.f27203l = interfaceC2262l;
        this.f27205l = ctry;
        Object obj = new Object();
        this.f27204l = obj;
        synchronized (obj) {
            this.f27200l = AbstractC10999l.mopub(interfaceC2262l, null, 0, new C11671l(this, null, 16), 3);
            Unit unit = Unit.INSTANCE;
        }
    }

    public C13904l(int i) {
        this.f27202l = i;
        switch (i) {
            case 4:
                this.f27204l = new Object();
                this.f27203l = new C11154l(0);
                break;
        }
    }

    public C13904l(Object obj) {
        this.f27202l = 0;
        this.f27204l = new Object();
        this.f27201l = 0;
        this.f27199l = false;
        this.f27205l = new HashMap();
        this.f27200l = new CopyOnWriteArraySet();
        this.f27203l = new AtomicReference(obj);
    }

    public C13904l(C18289l c18289l, AbstractC14971l abstractC14971l, int i, C17893l c17893l, C17893l c17893l2, boolean z) {
        this.f27202l = 1;
        this.f27200l = c18289l;
        this.f27204l = abstractC14971l;
        this.f27201l = i;
        this.f27203l = c17893l;
        this.f27205l = c17893l2;
        this.f27199l = z;
    }
}
