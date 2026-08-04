package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؘّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17724l implements InterfaceC18043l {
    public final Object admob;
    public final Object amazon;
    public Object billing;
    public int crashlytics;
    public int loadAd;
    public Object mopub;
    public Object purchase;
    public int yandex;
    public static final int[] subs = new int[3];
    public static final float[] isPro = {0.0f, 0.5f, 1.0f};
    public static final int[] firebase = new int[4];
    public static final float[] smaato = {0.0f, 0.0f, 0.5f, 1.0f};

    public C17724l() {
        this.admob = new Path();
        Paint paint = new Paint();
        this.mopub = paint;
        this.amazon = new Paint();
        pro(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.purchase = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.billing = new Paint(paint2);
    }

    public void Signature() {
        Object obj;
        List listCrashlytics = ((C14509l) this.amazon).crashlytics();
        int size = listCrashlytics.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listCrashlytics.get(i);
            if (((C0633l) obj).amazon().loadAd()) {
                break;
            } else {
                i++;
            }
        }
        C0633l c0633l = (C0633l) obj;
        if (c0633l == null && ((C8030l) this.mopub) == null) {
            return;
        }
        if (AbstractC8576l.yandex(c0633l != null ? c0633l.f2093l : null, (C8030l) this.mopub)) {
            return;
        }
        ((C15308l) this.admob).subs(this.crashlytics + 1);
    }

    @Override // defpackage.InterfaceC18043l
    public int adcel(int i, int i2) {
        return subscription((short[]) this.amazon, 0, i, i2);
    }

    @Override // defpackage.InterfaceC18043l
    public Object admob() {
        return (short[]) this.purchase;
    }

    public short[] ads(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = ((C2006l) this.admob).loadAd;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.InterfaceC18043l
    public void amazon(int i, int i2) {
        for (int i3 = 0; i3 < ((C2006l) this.admob).loadAd * i2; i3++) {
            ((short[]) this.purchase)[i + i3] = 0;
        }
    }

    @Override // defpackage.InterfaceC18043l
    public int billing(int i, int i2, int i3) {
        return subscription((short[]) this.purchase, i, i2, i3);
    }

    @Override // defpackage.InterfaceC18043l
    public void crashlytics(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            C2006l c2006l = (C2006l) this.admob;
            int i3 = c2006l.loadAd;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = (short[]) this.billing;
            int i4 = (c2006l.firebase * i3) + i2;
            short[] sArr2 = (short[]) this.mopub;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = ((long) c2006l.vip) * j;
            int i6 = c2006l.remoteconfig;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            sArr[i4] = (short) ((((j6 - j5) * ((long) s2)) + (((long) s) * j5)) / j6);
            i2++;
        }
    }

    @Override // defpackage.InterfaceC18043l
    public boolean firebase() {
        int i = this.yandex;
        return i != 0 && ((C2006l) this.admob).startapp != 0 && this.loadAd <= i * 3 && i * 2 > this.crashlytics * 3;
    }

    @Override // defpackage.InterfaceC18043l
    public void flush() {
        this.crashlytics = 0;
        this.yandex = 0;
        this.loadAd = 0;
    }

    @Override // defpackage.InterfaceC18043l
    public void isPro(int i) {
        this.billing = ads((short[]) this.billing, ((C2006l) this.admob).firebase, i);
    }

    public void license() {
        Object obj;
        Object obj2;
        AbstractC3386l abstractC3386lTapsense;
        C15308l c15308l = (C15308l) this.admob;
        C14509l c14509l = (C14509l) this.amazon;
        C15308l c15308l2 = (C15308l) this.billing;
        int i = 0;
        if (c15308l2.admob() != this.yandex) {
            this.yandex = c15308l2.admob();
            int iInmobi = AbstractC5020l.inmobi(this.loadAd);
            if (iInmobi == 0) {
                abstractC3386lTapsense = tapsense();
            } else if (iInmobi != 1) {
                abstractC3386lTapsense = C10323l.yandex;
                if (iInmobi == 2) {
                    List listCrashlytics = c14509l.crashlytics();
                    int size = listCrashlytics.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            abstractC3386lTapsense = tapsense().admob();
                            break;
                        } else if (AbstractC8576l.yandex(((C0633l) listCrashlytics.get(i2)).f2093l, (C8030l) this.mopub)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else if (iInmobi != 3) {
                    C18725l.billing();
                    return;
                }
            } else {
                abstractC3386lTapsense = tapsense().mopub((C8030l) this.mopub);
            }
            ((C10086l) this.purchase).setValue(abstractC3386lTapsense);
            this.loadAd = 1;
        }
        if (c15308l.admob() != this.crashlytics) {
            C8030l c8030l = null;
            if (c14509l.loadAd.loadAd()) {
                List listCrashlytics2 = c14509l.crashlytics();
                int size2 = listCrashlytics2.size();
                while (true) {
                    if (i >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listCrashlytics2.get(i);
                    if (((C0633l) obj2).amazon().loadAd()) {
                        break;
                    } else {
                        i++;
                    }
                }
                C0633l c0633l = (C0633l) obj2;
                if (c0633l != null) {
                    c8030l = c0633l.f2093l;
                }
            } else {
                List listLoadAd = c14509l.loadAd();
                int size3 = listLoadAd.size();
                while (true) {
                    if (i >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listLoadAd.get(i);
                    if (((C0633l) obj).amazon().loadAd()) {
                        break;
                    } else {
                        i++;
                    }
                }
                C0633l c0633l2 = (C0633l) obj;
                if (c0633l2 != null) {
                    c8030l = c0633l2.f2093l;
                }
            }
            if (!AbstractC8576l.yandex(c8030l, (C8030l) this.mopub)) {
                this.mopub = c8030l;
            }
            this.crashlytics = c15308l.admob();
        }
    }

    @Override // defpackage.InterfaceC18043l
    public void loadAd(int i, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.billing;
        int i2 = ((C2006l) this.admob).loadAd;
        shortBufferAsShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // defpackage.InterfaceC18043l
    public int metrica() {
        return 2;
    }

    @Override // defpackage.InterfaceC18043l
    public void mopub() {
        this.crashlytics = this.yandex;
    }

    public void pro(int i) {
        this.yandex = AbstractC14093l.subs(i, 68);
        this.loadAd = AbstractC14093l.subs(i, 20);
        this.crashlytics = AbstractC14093l.subs(i, 0);
        ((Paint) this.amazon).setColor(this.yandex);
    }

    @Override // defpackage.InterfaceC18043l
    public void purchase(int i, int i2) {
        short[] sArr = (short[]) this.purchase;
        C2006l c2006l = (C2006l) this.admob;
        int i3 = c2006l.admob / i2;
        int i4 = c2006l.loadAd;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            ((short[]) this.amazon)[i7] = (short) (i8 / i5);
        }
    }

    @Override // defpackage.InterfaceC18043l
    public void remoteconfig(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = (short[]) this.billing;
        short[] sArr2 = (short[]) this.purchase;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.InterfaceC18043l
    public Object smaato() {
        return (short[]) this.mopub;
    }

    @Override // defpackage.InterfaceC18043l
    public void startapp(int i) {
        this.purchase = ads((short[]) this.purchase, ((C2006l) this.admob).isPro, i);
    }

    @Override // defpackage.InterfaceC18043l
    public Object subs() {
        return (short[]) this.billing;
    }

    public int subscription(short[] sArr, int i, int i2, int i3) {
        int i4 = i * ((C2006l) this.admob).loadAd;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.yandex = i6 / i7;
        this.loadAd = i8 / i5;
        return i7;
    }

    public AbstractC3386l tapsense() {
        return (AbstractC3386l) ((C10086l) this.purchase).getValue();
    }

    @Override // defpackage.InterfaceC18043l
    public void vip(int i) {
        this.mopub = ads((short[]) this.mopub, ((C2006l) this.admob).smaato, i);
    }

    @Override // defpackage.InterfaceC18043l
    public void yandex(int i, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.purchase;
        C2006l c2006l = (C2006l) this.admob;
        shortBufferAsShortBuffer.get(sArr, c2006l.isPro * c2006l.loadAd, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    public C17724l(C14509l c14509l) {
        this.amazon = c14509l;
        this.purchase = AbstractC8020l.smaato(C10323l.yandex);
        this.billing = new C15308l(0);
        this.loadAd = 1;
        this.admob = new C15308l(0);
    }

    public C17724l(C2006l c2006l) {
        this.admob = c2006l;
        int i = c2006l.admob;
        this.amazon = new short[i];
        int i2 = i * c2006l.loadAd;
        this.purchase = new short[i2];
        this.billing = new short[i2];
        this.mopub = new short[i2];
    }
}
