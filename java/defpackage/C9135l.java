package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌۢۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9135l extends AbstractC5097l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f18782l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f18783l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f18784l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C16511l f18785l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f18786l;

    public C9135l(C16511l c16511l) {
        super(c16511l.mopub, 2);
        this.f18786l = AbstractC11990l.loadAd();
        this.f18785l = c16511l;
        this.f18784l = AbstractC8020l.smaato(EnumC18546l.f36207l);
        this.f18783l = AbstractC8020l.smaato(new C12097l(0L, 0L, 0.0f));
        int i = 0;
        this.f18782l = AbstractC8020l.smaato(new C8311l(i, 7, (String) null));
    }

    public static final void ad(C9135l c9135l) {
        String str;
        InterfaceC2779l interfaceC2779l = c9135l.f18785l.purchase;
        if (interfaceC2779l instanceof C1480l) {
            str = ((C1480l) interfaceC2779l).yandex;
        } else {
            if (!(interfaceC2779l instanceof C3829l)) {
                C18725l.billing();
                return;
            }
            str = ((C3829l) interfaceC2779l).yandex;
        }
        c9135l.f5081l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object pro(C9135l c9135l, AbstractC0283l abstractC0283l) {
        C3008l c3008l;
        Object c18435l;
        String message;
        C10086l c10086l = c9135l.f18782l;
        if (abstractC0283l instanceof C3008l) {
            c3008l = (C3008l) abstractC0283l;
            int i = c3008l.f6517l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3008l.f6517l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3008l = new C3008l(c9135l, abstractC0283l);
            }
        } else {
            c3008l = new C3008l(c9135l, abstractC0283l);
        }
        Object objFirebase = c3008l.f6516l;
        int i2 = c3008l.f6517l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objFirebase);
                c9135l.tapsense(true);
                c9135l.isVip(EnumC18546l.f36209l);
                Context applicationContext = c9135l.f5081l.getApplicationContext();
                String str = C14025l.f27330l;
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                C14025l c14025lPurchase = C6162l.ads(vKXApplication.getDir("ota", 0)).purchase("vkx_ota_payload.apk");
                c3008l.f6517l = 1;
                C16552l c16552l = AbstractC11463l.yandex;
                objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C13378l(c14025lPurchase, applicationContext, null), c3008l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(objFirebase);
            }
            c18435l = (Unit) objFirebase;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            int i3 = 2;
            if ((thYandex instanceof IOException) && (message = thYandex.getMessage()) != null && AbstractC16648l.isVip(message, "Failed to allocate", false)) {
                String message2 = thYandex.getMessage();
                c10086l.setValue(new C8311l(6, i3, message2 != null ? message2 : ""));
            } else {
                String message3 = thYandex.getMessage();
                c10086l.setValue(new C8311l(-1, i3, message3 != null ? message3 : ""));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC2338l
    public final void admob(int i, int i2, Intent intent) {
        if (i == 39) {
            advert();
        }
    }

    public final void advert() {
        if (AbstractC1804l.yandex()) {
            AbstractC10999l.mopub(this, null, 0, new C11671l(this, null, 13), 3);
        } else {
            tapsense(this.f18785l.mopub);
            isVip(EnumC18546l.f36205l);
        }
    }

    public final void isVip(EnumC18546l enumC18546l) {
        this.f18784l.setValue(enumC18546l);
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-1222347993);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(312146988, new C10994l(this, AbstractC6363l.admob(0, 1, c6956l), !this.f18785l.mopub, 3), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15583l(this, i, i3);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void remoteconfig(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i = extras.getInt("android.content.pm.extra.STATUS");
            Intent intent2 = null;
            intent2 = null;
            if (i == -1) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        intent2 = (Intent) extras2.getParcelable("android.intent.extra.INTENT", Intent.class);
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    if (extras3 != null) {
                        intent2 = (Intent) extras3.getParcelable("android.intent.extra.INTENT");
                    }
                }
                if (intent2 != null) {
                    this.f5081l.startActivity(intent2);
                    return;
                }
                return;
            }
            if (i != 0) {
                tapsense(this.f18785l.mopub);
                Bundle extras4 = intent.getExtras();
                String string = extras4 != null ? extras4.getString("android.content.pm.extra.PACKAGE_NAME") : null;
                Bundle extras5 = intent.getExtras();
                String string2 = extras5 != null ? extras5.getString("android.content.pm.extra.STATUS_MESSAGE") : null;
                if (string2 == null) {
                    string2 = "";
                }
                this.f18782l.setValue(new C8311l(string, i, string2));
                isVip(EnumC18546l.f36208l);
            }
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        AbstractC11990l.billing(this, null);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f18786l.f36440l;
    }
}
