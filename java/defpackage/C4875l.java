package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lؗٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4875l implements InterfaceC15535l, InterfaceC12365l, InterfaceC9500l, InterfaceC18679l, InterfaceC15372l, InterfaceC11185l, InterfaceC11459l, InterfaceC16975l, InterfaceC12052l, InterfaceC0945l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9940l;

    public /* synthetic */ C4875l(int i, C18503l c18503l) {
        this.f9940l = 19;
    }

    public static /* synthetic */ void firebase() {
        throw new NoSuchElementException();
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint isPro(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void remoteconfig(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void smaato(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* bridge */ /* synthetic */ boolean vip(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException yandex(Object obj) {
        return (ForegroundServiceStartNotAllowedException) obj;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        switch (this.f9940l) {
            case 4:
                ((ExecutorService) obj).shutdown();
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C18602l) obj).mo2765l();
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C18602l) obj).mo2814volatile();
                break;
            default:
                ((C18602l) obj).mo2760goto();
                break;
        }
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) {
        C0624l c0624l = (C0624l) abstractC6968l;
        C2782l c2782l = C2782l.f6068l;
        C11644l c11644l = c0624l.admob;
        C0624l.isPro(c11644l, c2782l);
        C9358l c9358l = (C9358l) c11644l.f23360l;
        AbstractC15901l.smaato(c9358l);
        AbstractC15901l.billing(c9358l, (Integer) c0624l.admob.f23362l).loadAd();
        return new C7113l();
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        int i = 18;
        switch (this.f9940l) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C16811l c16811l = c13208l.yandex;
                if (c13208l.mo319l()) {
                    c16811l.getClass();
                    AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
                    c16811l.f32840l.getClass();
                    return;
                }
                return;
            case 20:
                c13208l.subs.mopub(26, new C8876l(i));
                return;
            case 21:
                C16811l c16811l2 = c13208l.yandex;
                Objects.requireNonNull(c16811l2);
                c16811l2.m4197abstract(new RunnableC11297l(i, c16811l2));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        String str = (String) c12418l.f24518l;
        if (!str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            return AbstractC12832l.billing(C9982l.m2824throws((AbstractC15257l) c12418l.f24519l, C7597l.yandex()), (C9358l) c12418l.f24521l);
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) throws GeneralSecurityException {
        C9358l c9358l;
        C8166l c8166l = (C8166l) abstractC6968l;
        C11015l c11015lApplovin = C15750l.applovin();
        C9982l c9982lAdmob = AbstractC12832l.admob(c8166l.admob);
        c11015lApplovin.purchase();
        C15750l.isVip((C15750l) c11015lApplovin.f19242l, c9982lAdmob);
        C14809l c14809lBilling = ((C15750l) c11015lApplovin.yandex()).billing();
        C18176l c18176l = C18176l.f35613l;
        C17927l c17927l = c8166l.admob.yandex;
        if (C17927l.billing == c17927l) {
            c9358l = C9358l.crashlytics;
        } else {
            if (C17927l.mopub != c17927l) {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c17927l)));
            }
            c9358l = C9358l.purchase;
        }
        return C11644l.m3137l("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", c14809lBilling, c18176l, c9358l, c8166l.isPro);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        switch (this.f9940l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((InterfaceC13521l) obj).Signature(1);
                break;
            default:
                ((InterfaceC13521l) obj).adcel(0.0f);
                break;
        }
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        switch (this.f9940l) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                interfaceC3270l.getClass();
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                interfaceC3270l.getClass();
                break;
            default:
                interfaceC3270l.loadAd(i);
                break;
        }
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            C8339l.metrica("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            C15750l c15750lAppmetrica = C15750l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
            if (c15750lAppmetrica.premium() != 0) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(c15750lAppmetrica)));
            }
            C9982l c9982lSignatures = c15750lAppmetrica.signatures();
            C9358l c9358l = (C9358l) c11644l.f23360l;
            C9358l c9358l2 = C9358l.crashlytics;
            if (c9358l != c9358l2 && c9358l != (c9358l2 = C9358l.purchase)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
            }
            return C8166l.isPro(AbstractC12832l.billing(c9982lSignatures, c9358l2), (Integer) c11644l.f23362l);
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC11459l
    public int subs(Object obj) {
        String str = ((C6403l) obj).yandex;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public /* synthetic */ C4875l(int i) {
        this.f9940l = i;
    }

    @Override // defpackage.InterfaceC11185l
    public void loadAd(float f) {
    }
}
