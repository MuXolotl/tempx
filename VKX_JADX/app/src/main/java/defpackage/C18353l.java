package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionSession;
import android.os.IInterface;
import android.view.Surface;
import androidx.car.app.ICarHost;
import androidx.car.app.hardware.ICarHardwareHost;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: l٘ۦٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18353l implements InterfaceC16004l, InterfaceC4969l, InterfaceC3263l, InterfaceC5755l, InterfaceC11527l, InterfaceC1082l, InterfaceC15372l, InterfaceC6351l, InterfaceC15535l, InterfaceC12365l, InterfaceC9500l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35871l;

    public /* synthetic */ C18353l(C0554l c0554l) {
        this.f35871l = 18;
    }

    public static /* synthetic */ void adcel(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* bridge */ /* synthetic */ Class ads() {
        return CameraExtensionSession.class;
    }

    public static /* synthetic */ void loadAd(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void metrica(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void mopub(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void remoteconfig(int i, Object obj, Object obj2) {
        throw new C5016l("Unexpected value encoding when reading " + obj + ((Object) ". Expected addition info value < 28, got ") + i + ((Object) " (decoded from ") + obj2 + ')');
    }

    public static /* synthetic */ void smaato(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i2 + ')').toString());
    }

    public static /* synthetic */ void startapp(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(')');
        throw new C5016l(sb.toString());
    }

    public static /* synthetic */ void vip(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // defpackage.InterfaceC15372l
    public Object admob(AbstractC6968l abstractC6968l) {
        C5690l c5690l = (C5690l) abstractC6968l;
        try {
            C2254l.crashlytics();
            return new C2254l(((C0346l) c5690l.subs.f16631l).loadAd(), c5690l.isPro.loadAd(), C2254l.crashlytics().getProvider());
        } catch (GeneralSecurityException unused) {
            return new C1918l(((C0346l) c5690l.subs.f16631l).loadAd(), 1, c5690l.isPro.loadAd());
        }
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) {
        return C12418l.metrica("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", AbstractC8020l.startapp(((C15840l) abstractC3302l).yandex), C1418l.isVip().billing());
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        switch (this.f35871l) {
            case 10:
                return new C12404l((C0466l) obj);
            default:
                return Integer.valueOf(((C17690l) obj).yandex);
        }
    }

    @Override // defpackage.InterfaceC15535l
    public AbstractC3302l billing(C12418l c12418l) throws GeneralSecurityException {
        String str = (String) c12418l.f24518l;
        if (!str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            C8339l.metrica(AbstractC14814l.startapp("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            C1418l.signatures((AbstractC15257l) c12418l.f24519l, C7597l.yandex());
            return new C15840l(AbstractC8020l.adcel((C9358l) c12418l.f24521l));
        } catch (C2297l e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        C5690l c5690l = (C5690l) abstractC6968l;
        C12510l c12510lApplovin = C16756l.applovin();
        byte[] bArrLoadAd = ((C0346l) c5690l.subs.f16631l).loadAd();
        C14809l c14809lMopub = AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd);
        c12510lApplovin.purchase();
        C16756l.isVip((C16756l) c12510lApplovin.f19242l, c14809lMopub);
        return C11644l.m3137l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C16756l) c12510lApplovin.yandex()).billing(), C18176l.f35614l, AbstractC8020l.startapp(c5690l.admob.yandex), c5690l.firebase);
    }

    @Override // defpackage.InterfaceC1082l
    public Object firebase(IInterface iInterface) {
        return ICarHardwareHost.Stub.asInterface(((ICarHost) iInterface).getHost("hardware"));
    }

    @Override // defpackage.InterfaceC4969l
    public void isPro(C15691l c15691l) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c15691l.loadAd.getWidth(), c15691l.loadAd.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        c15691l.yandex(surface, AbstractC12272l.yandex(), new C4143l(surface, surfaceTexture, 0));
    }

    @Override // defpackage.InterfaceC9500l
    public AbstractC6968l purchase(C11644l c11644l) throws GeneralSecurityException {
        if (!((String) c11644l.f23358l).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            C8339l.metrica("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            C16756l c16756lAppmetrica = C16756l.appmetrica((AbstractC15257l) c11644l.f23357l, C7597l.yandex());
            if (c16756lAppmetrica.premium() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C5690l.isPro(AbstractC8020l.adcel((C9358l) c11644l.f23360l), new C7972l(24, C0346l.yandex(c16756lAppmetrica.signatures().firebase())), (Integer) c11644l.f23362l);
        } catch (C2297l unused) {
            C18262l.ads("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // defpackage.InterfaceC5755l
    public void subs(InterfaceC12679l interfaceC12679l) throws Exception {
        try {
            InterfaceC11792l interfaceC11792lSmaato = interfaceC12679l.smaato();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = null, image.isNull = ");
            sb.append(interfaceC11792lSmaato == null);
            AbstractC5088l.yandex("CaptureNode", sb.toString());
            if (interfaceC11792lSmaato != null) {
                AbstractC12225l.crashlytics();
                AbstractC5088l.tapsense("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC11792lSmaato);
                interfaceC11792lSmaato.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public /* synthetic */ C18353l(int i) {
        this.f35871l = i;
    }

    @Override // defpackage.InterfaceC3263l
    public void cancel() {
    }

    @Override // defpackage.InterfaceC11527l
    public void onStopRecording() {
    }
}
