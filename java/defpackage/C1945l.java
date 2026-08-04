package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؓٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1945l extends AbstractC1091l implements Handler.Callback {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public boolean f4419l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C10563l f4420l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final InterfaceC15534l f4421l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC12550l f4422l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C4136l f4423l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C5978l f4424l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public int f4425l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C13772l f4426l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC18330l f4427l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C10563l f4428l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public InterfaceC1127l f4429l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public long f4430l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public int f4431l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C1626l f4432l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public long f4433l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C10023l f4434l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f4435l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final Handler f4436l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f4437l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1945l(SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, Looper looper) {
        Handler handler;
        super(3);
        C1770l c1770l = InterfaceC15534l.f30346l;
        this.f4427l = surfaceHolderCallbackC18330l;
        if (looper == null) {
            handler = null;
        } else {
            String str = AbstractC15323l.yandex;
            handler = new Handler(looper, this);
        }
        this.f4436l = handler;
        this.f4421l = c1770l;
        this.f4426l = new C13772l(28);
        this.f4423l = new C4136l(1);
        this.f4434l = new C10023l();
        this.f4433l = -9223372036854775807L;
        this.f4430l = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC1091l
    public final void Signature(C5978l[] c5978lArr, long j, long j2, C5019l c5019l) {
        C5978l c5978l = c5978lArr[0];
        this.f4424l = c5978l;
        if (Objects.equals(c5978l.metrica, "application/x-media3-cues")) {
            this.f4422l = this.f4424l.f12616extends == 1 ? new C12147l() : new C14637l();
            return;
        }
        inmobi();
        if (this.f4429l != null) {
            this.f4425l = 1;
        } else {
            m1098synchronized();
        }
    }

    @Override // defpackage.AbstractC1091l
    public final void ad(long j, long j2) {
        boolean z;
        C10023l c10023l;
        boolean z2;
        long jFirebase;
        if (this.f3023l) {
            long j3 = this.f4433l;
            if (j3 != -9223372036854775807L && j >= j3) {
                m1100volatile();
                this.f4435l = true;
            }
        }
        if (this.f4435l) {
            return;
        }
        C5978l c5978l = this.f4424l;
        c5978l.getClass();
        boolean zEquals = Objects.equals(c5978l.metrica, "application/x-media3-cues");
        Handler handler = this.f4436l;
        C10023l c10023l2 = this.f4434l;
        boolean zLoadAd = false;
        zLoadAd = false;
        zLoadAd = false;
        if (zEquals) {
            this.f4422l.getClass();
            if (!this.f4419l) {
                C4136l c4136l = this.f4423l;
                if (pro(c10023l2, c4136l, 0) == -4) {
                    if (c4136l.crashlytics(4)) {
                        this.f4419l = true;
                    } else {
                        c4136l.adcel();
                        ByteBuffer byteBuffer = c4136l.f8498l;
                        byteBuffer.getClass();
                        long j4 = c4136l.f8496l;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f4426l.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C16971l c16971lMetrica = AbstractC1186l.metrica();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            c16971lMetrica.crashlytics(C17456l.yandex(bundle2));
                        }
                        C8755l c8755l = new C8755l(j4, bundle.getLong("d"), c16971lMetrica.mopub());
                        c4136l.remoteconfig();
                        zLoadAd = this.f4422l.loadAd(c8755l, j);
                    }
                }
            }
            long jYandex = this.f4422l.yandex(this.f4430l);
            if (jYandex == Long.MIN_VALUE && this.f4419l && !zLoadAd) {
                this.f4435l = true;
            }
            if (jYandex != Long.MIN_VALUE && jYandex <= j) {
                zLoadAd = true;
            }
            if (zLoadAd) {
                AbstractC1186l abstractC1186lCrashlytics = this.f4422l.crashlytics(j);
                long jAmazon = this.f4422l.amazon(j);
                C16684l c16684l = new C16684l(m1096package(jAmazon), abstractC1186lCrashlytics);
                if (handler != null) {
                    handler.obtainMessage(1, c16684l).sendToTarget();
                } else {
                    m1097strictfp(c16684l);
                }
                this.f4422l.purchase(jAmazon);
            }
            this.f4430l = j;
            return;
        }
        inmobi();
        this.f4430l = j;
        if (this.f4428l == null) {
            InterfaceC1127l interfaceC1127l = this.f4429l;
            interfaceC1127l.getClass();
            interfaceC1127l.loadAd(j);
            try {
                InterfaceC1127l interfaceC1127l2 = this.f4429l;
                interfaceC1127l2.getClass();
                this.f4428l = (C10563l) interfaceC1127l2.crashlytics();
            } catch (C8995l e) {
                AbstractC6427l.subs("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f4424l, e);
                C16684l c16684l2 = new C16684l(m1096package(this.f4430l), C13708l.f26763l);
                if (handler != null) {
                    handler.obtainMessage(1, c16684l2).sendToTarget();
                } else {
                    m1097strictfp(c16684l2);
                }
                m1100volatile();
                InterfaceC1127l interfaceC1127l3 = this.f4429l;
                interfaceC1127l3.getClass();
                interfaceC1127l3.release();
                this.f4429l = null;
                this.f4425l = 0;
                m1098synchronized();
                return;
            }
        }
        if (this.f3010l != 2) {
            return;
        }
        if (this.f4420l != null) {
            long jM1099throws = m1099throws();
            z = false;
            while (jM1099throws <= j) {
                this.f4431l++;
                jM1099throws = m1099throws();
                z = true;
            }
        } else {
            z = false;
        }
        C10563l c10563l = this.f4428l;
        if (c10563l == null) {
            c10023l = c10023l2;
            z2 = z;
        } else if (c10563l.crashlytics(4)) {
            if (!z && m1099throws() == Long.MAX_VALUE) {
                if (this.f4425l == 2) {
                    m1100volatile();
                    InterfaceC1127l interfaceC1127l4 = this.f4429l;
                    interfaceC1127l4.getClass();
                    interfaceC1127l4.release();
                    this.f4429l = null;
                    this.f4425l = 0;
                    m1098synchronized();
                } else {
                    m1100volatile();
                    this.f4435l = true;
                }
            }
            c10023l = c10023l2;
            z2 = z;
        } else {
            c10023l = c10023l2;
            if (c10563l.f23515l <= j) {
                C10563l c10563l2 = this.f4420l;
                if (c10563l2 != null) {
                    z2 = z;
                    c10563l2.vip();
                }
                z2 = z;
                this.f4431l = c10563l.purchase(j);
                this.f4420l = c10563l;
                this.f4428l = null;
                z2 = true;
            }
        }
        if (z2) {
            this.f4420l.getClass();
            int iPurchase = this.f4420l.purchase(j);
            if (iPurchase == 0 || this.f4420l.subscription() == 0) {
                jFirebase = this.f4420l.f23515l;
            } else {
                C10563l c10563l3 = this.f4420l;
                jFirebase = iPurchase == -1 ? c10563l3.firebase(c10563l3.subscription() - 1) : c10563l3.firebase(iPurchase - 1);
            }
            C16684l c16684l3 = new C16684l(m1096package(jFirebase), this.f4420l.metrica(j));
            if (handler != null) {
                handler.obtainMessage(1, c16684l3).sendToTarget();
            } else {
                m1097strictfp(c16684l3);
            }
        }
        if (this.f4425l == 2) {
            return;
        }
        while (!this.f4419l) {
            try {
                C1626l c1626l = this.f4432l;
                if (c1626l == null) {
                    InterfaceC1127l interfaceC1127l5 = this.f4429l;
                    interfaceC1127l5.getClass();
                    c1626l = (C1626l) interfaceC1127l5.amazon();
                    if (c1626l == null) {
                        return;
                    } else {
                        this.f4432l = c1626l;
                    }
                }
                if (this.f4425l == 1) {
                    c1626l.f16423l = 4;
                    InterfaceC1127l interfaceC1127l6 = this.f4429l;
                    interfaceC1127l6.getClass();
                    interfaceC1127l6.purchase(c1626l);
                    this.f4432l = null;
                    this.f4425l = 2;
                    return;
                }
                int iPro = pro(c10023l, c1626l, 0);
                if (iPro == -4) {
                    if (c1626l.crashlytics(4)) {
                        this.f4419l = true;
                        this.f4437l = false;
                    } else {
                        C5978l c5978l2 = (C5978l) c10023l.f20418l;
                        if (c5978l2 == null) {
                            return;
                        }
                        c1626l.f3957l = c5978l2.tapsense;
                        c1626l.adcel();
                        this.f4437l &= !c1626l.crashlytics(1);
                    }
                    if (!this.f4437l) {
                        InterfaceC1127l interfaceC1127l7 = this.f4429l;
                        interfaceC1127l7.getClass();
                        interfaceC1127l7.purchase(c1626l);
                        this.f4432l = null;
                    }
                } else if (iPro == -3) {
                    return;
                }
            } catch (C8995l e2) {
                AbstractC6427l.subs("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f4424l, e2);
                C16684l c16684l4 = new C16684l(m1096package(this.f4430l), C13708l.f26763l);
                if (handler != null) {
                    handler.obtainMessage(1, c16684l4).sendToTarget();
                } else {
                    m1097strictfp(c16684l4);
                }
                m1100volatile();
                InterfaceC1127l interfaceC1127l8 = this.f4429l;
                interfaceC1127l8.getClass();
                interfaceC1127l8.release();
                this.f4429l = null;
                this.f4425l = 0;
                m1098synchronized();
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m1097strictfp((C16684l) message.obj);
            return true;
        }
        C18073l.admob();
        return false;
    }

    public final void inmobi() {
        boolean z = Objects.equals(this.f4424l.metrica, "application/cea-608") || Objects.equals(this.f4424l.metrica, "application/x-mp4-cea-608") || Objects.equals(this.f4424l.metrica, "application/cea-708");
        String str = this.f4424l.metrica;
        if (z) {
            return;
        }
        C8339l.smaato(AbstractC11028l.smaato("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    @Override // defpackage.AbstractC1091l
    public final String isPro() {
        return "TextRenderer";
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final long m1096package(long j) {
        AbstractC12442l.subscription(j != -9223372036854775807L);
        return j - this.f3022l;
    }

    @Override // defpackage.AbstractC1091l
    public final int premium(C5978l c5978l) {
        boolean zEquals = Objects.equals(c5978l.metrica, "application/x-media3-cues");
        String str = c5978l.metrica;
        if (!zEquals) {
            C1770l c1770l = (C1770l) this.f4421l;
            c1770l.getClass();
            if (!((C8565l) c1770l.f4179l).mopub(c5978l) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return AbstractC3825l.smaato(str) ? AbstractC4338l.ads(1, 0, 0, 0) : AbstractC4338l.ads(0, 0, 0, 0);
            }
        }
        return AbstractC4338l.ads(c5978l.f12614catch == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // defpackage.AbstractC1091l
    public final boolean remoteconfig() {
        C5978l c5978l = this.f4424l;
        if (c5978l != null) {
            if (Objects.equals(c5978l.metrica, "application/x-media3-cues")) {
                InterfaceC12550l interfaceC12550l = this.f4422l;
                interfaceC12550l.getClass();
                if (interfaceC12550l.yandex(this.f4430l) == Long.MIN_VALUE) {
                    try {
                        InterfaceC11759l interfaceC11759l = this.f3020l;
                        interfaceC11759l.getClass();
                        interfaceC11759l.firebase();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f4435l) {
                    return false;
                }
                if (this.f4419l) {
                    C10563l c10563l = this.f4420l;
                    long j = this.f4430l;
                    if (c10563l == null || c10563l.subscription() <= 0 || c10563l.firebase(c10563l.subscription() - 1) <= j) {
                        C10563l c10563l2 = this.f4428l;
                        long j2 = this.f4430l;
                        if ((c10563l2 == null || c10563l2.subscription() <= 0 || c10563l2.firebase(c10563l2.subscription() - 1) <= j2) && this.f4432l != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC1091l
    public final boolean smaato() {
        return this.f4435l;
    }

    @Override // defpackage.AbstractC1091l
    public final void startapp(long j, boolean z, boolean z2) {
        this.f4430l = j;
        InterfaceC12550l interfaceC12550l = this.f4422l;
        if (interfaceC12550l != null) {
            interfaceC12550l.clear();
        }
        C16684l c16684l = new C16684l(m1096package(this.f4430l), C13708l.f26763l);
        Handler handler = this.f4436l;
        if (handler != null) {
            handler.obtainMessage(1, c16684l).sendToTarget();
        } else {
            m1097strictfp(c16684l);
        }
        this.f4419l = false;
        this.f4435l = false;
        this.f4433l = -9223372036854775807L;
        C5978l c5978l = this.f4424l;
        if (c5978l == null || Objects.equals(c5978l.metrica, "application/x-media3-cues")) {
            return;
        }
        if (this.f4425l == 0) {
            m1100volatile();
            InterfaceC1127l interfaceC1127l = this.f4429l;
            interfaceC1127l.getClass();
            interfaceC1127l.flush();
            interfaceC1127l.yandex(this.f3019l);
            return;
        }
        m1100volatile();
        InterfaceC1127l interfaceC1127l2 = this.f4429l;
        interfaceC1127l2.getClass();
        interfaceC1127l2.release();
        this.f4429l = null;
        this.f4425l = 0;
        m1098synchronized();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m1097strictfp(C16684l c16684l) {
        C13708l c13708l = c16684l.yandex;
        SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = this.f4427l;
        surfaceHolderCallbackC18330l.yandex.f34677l.mopub(27, new C18696l(0, c13708l));
        C17804l c17804l = surfaceHolderCallbackC18330l.yandex;
        c17804l.f34672l = c16684l;
        c17804l.f34677l.mopub(27, new C2683l(24, c16684l));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m1098synchronized() {
        InterfaceC1127l c18210l;
        byte b = 1;
        this.f4437l = true;
        C5978l c5978l = this.f4424l;
        c5978l.getClass();
        C8565l c8565l = (C8565l) ((C1770l) this.f4421l).f4179l;
        String str = c5978l.metrica;
        int i = c5978l.f12620private;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    c18210l = new C5916l(str, i);
                    break;
                case 2:
                    c18210l = new C17633l(i, c5978l.ads);
                    break;
                default:
                    if (c8565l.mopub(c5978l)) {
                        C8339l.metrica(AbstractC14814l.startapp("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    InterfaceC17215l interfaceC17215lIsPro = c8565l.isPro(c5978l);
                    interfaceC17215lIsPro.getClass().getSimpleName().concat("Decoder");
                    c18210l = new C18210l(interfaceC17215lIsPro);
                    break;
                    break;
            }
        } else if (c8565l.mopub(c5978l)) {
            C8339l.metrica(AbstractC14814l.startapp("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            InterfaceC17215l interfaceC17215lIsPro2 = c8565l.isPro(c5978l);
            interfaceC17215lIsPro2.getClass().getSimpleName().concat("Decoder");
            c18210l = new C18210l(interfaceC17215lIsPro2);
        }
        this.f4429l = c18210l;
        c18210l.yandex(this.f3019l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final long m1099throws() {
        if (this.f4431l == -1) {
            return Long.MAX_VALUE;
        }
        this.f4420l.getClass();
        if (this.f4431l >= this.f4420l.subscription()) {
            return Long.MAX_VALUE;
        }
        return this.f4420l.firebase(this.f4431l);
    }

    @Override // defpackage.AbstractC1091l
    public final void vip() {
        this.f4424l = null;
        this.f4433l = -9223372036854775807L;
        C16684l c16684l = new C16684l(m1096package(this.f4430l), C13708l.f26763l);
        Handler handler = this.f4436l;
        if (handler != null) {
            handler.obtainMessage(1, c16684l).sendToTarget();
        } else {
            m1097strictfp(c16684l);
        }
        this.f4430l = -9223372036854775807L;
        if (this.f4429l != null) {
            m1100volatile();
            InterfaceC1127l interfaceC1127l = this.f4429l;
            interfaceC1127l.getClass();
            interfaceC1127l.release();
            this.f4429l = null;
            this.f4425l = 0;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m1100volatile() {
        this.f4432l = null;
        this.f4431l = -1;
        C10563l c10563l = this.f4420l;
        if (c10563l != null) {
            c10563l.vip();
            this.f4420l = null;
        }
        C10563l c10563l2 = this.f4428l;
        if (c10563l2 != null) {
            c10563l2.vip();
            this.f4428l = null;
        }
    }
}
