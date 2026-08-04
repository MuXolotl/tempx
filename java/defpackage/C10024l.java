package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10024l {
    public final float ad;
    public int admob;
    public boolean advert;
    public final int applovin;
    public C14440l appmetrica;
    public int billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final boolean f20420case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final int f20421catch;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final boolean f20423continue;
    public float crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public int f20424default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public boolean f20425else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final long f20426extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final int f20427final;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final int f20428for;
    public boolean inmobi;
    public int isVip;
    public int mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final int f20430native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f20431package;
    public AbstractC4755l premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int f20432private;
    public final float pro;
    public int purchase;
    public C7598l signatures;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public int f20433static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final long f20434strictfp;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final boolean f20435switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public boolean f20436synchronized;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final boolean f20437throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f20438throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public InterfaceC3177l f20439volatile;
    public int yandex = RecyclerView.UNDEFINED_DURATION;
    public final int loadAd = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
    public int amazon = RecyclerView.UNDEFINED_DURATION;
    public final boolean subs = true;
    public final int isPro = RecyclerView.UNDEFINED_DURATION;
    public int firebase = AbstractC5573l.ads(TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics()));
    public final int smaato = RecyclerView.UNDEFINED_DURATION;
    public final int remoteconfig = RecyclerView.UNDEFINED_DURATION;
    public float vip = 0.5f;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public int f20422class = 1;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final int f20429interface = 1;
    public EnumC6748l metrica = EnumC6748l.f14149l;
    public final float startapp = 2.5f;
    public int adcel = -16777216;
    public float ads = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
    public String subscription = "";
    public int tapsense = -1;
    public float Signature = 12.0f;
    public int license = 17;

    public C10024l(Activity activity) {
        AbstractC5573l.ads(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
        AbstractC5573l.ads(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
        AbstractC5573l.ads(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        this.pro = 1.0f;
        this.ad = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        this.signatures = new C7598l();
        this.premium = C11428l.yandex;
        this.applovin = 17;
        this.inmobi = true;
        this.f20438throws = true;
        this.f20436synchronized = true;
        this.f20434strictfp = -1L;
        this.f20430native = RecyclerView.UNDEFINED_DURATION;
        this.f20432private = RecyclerView.UNDEFINED_DURATION;
        this.f20433static = 3;
        this.f20424default = 2;
        this.f20426extends = 500L;
        this.f20427final = 1;
        this.f20428for = RecyclerView.UNDEFINED_DURATION;
        boolean z = activity.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f20437throw = z;
        this.f20421catch = z ? -1 : 1;
        this.f20425else = true;
        this.f20420case = true;
        this.f20435switch = true;
        this.f20423continue = true;
    }

    public final /* synthetic */ int loadAd() {
        int i = this.smaato;
        return i != Integer.MIN_VALUE ? i : this.firebase;
    }

    public final /* synthetic */ int yandex() {
        int i = this.remoteconfig;
        return i != Integer.MIN_VALUE ? i : this.firebase;
    }
}
