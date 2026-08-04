package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: lَۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10094l {
    public C14511l Signature;
    public int ad;
    public X509TrustManager adcel;
    public C13863l admob;
    public List ads;
    public int advert;
    public C5501l applovin;
    public C3097l appmetrica;
    public boolean billing;
    public C13863l firebase;
    public boolean isPro;
    public int isVip;
    public AbstractC5711l license;
    public C5008l loadAd;
    public SocketFactory metrica;
    public boolean mopub;
    public long premium;
    public int pro;
    public C18262l purchase;
    public ProxySelector remoteconfig;
    public int signatures;
    public C8565l smaato;
    public SSLSocketFactory startapp;
    public boolean subs;
    public List subscription;
    public C15931l tapsense;
    public InterfaceC8038l vip;
    public C12014l yandex = new C12014l(11);
    public final ArrayList crashlytics = new ArrayList();
    public final ArrayList amazon = new ArrayList();

    public C10094l() {
        TimeZone timeZone = AbstractC11432l.yandex;
        this.purchase = new C18262l(7);
        this.billing = true;
        this.mopub = true;
        C13863l c13863l = InterfaceC8038l.yandex;
        this.admob = c13863l;
        this.subs = true;
        this.isPro = true;
        this.firebase = C13863l.f27115l;
        this.smaato = C8565l.f17666l;
        this.vip = c13863l;
        this.metrica = SocketFactory.getDefault();
        this.ads = C11610l.f23324throws;
        this.subscription = C11610l.inmobi;
        this.tapsense = C15931l.yandex;
        this.Signature = C14511l.crashlytics;
        this.ad = ModuleDescriptor.MODULE_VERSION;
        this.advert = ModuleDescriptor.MODULE_VERSION;
        this.isVip = ModuleDescriptor.MODULE_VERSION;
        this.signatures = 60000;
        this.premium = 1024L;
    }
}
