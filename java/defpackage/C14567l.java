package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lًٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14567l {
    public C6539l admob;
    public final C3982l amazon;
    public final C4288l billing;
    public final C17395l crashlytics;
    public String firebase = "";
    public boolean isPro;
    public final C8322l loadAd;
    public final InterfaceC12932l mopub;
    public final InterfaceC15829l purchase;
    public boolean subs;
    public final C8137l yandex;

    public C14567l(C8137l c8137l, C8322l c8322l, C17395l c17395l, C3982l c3982l, InterfaceC15829l interfaceC15829l, C4288l c4288l, InterfaceC12932l interfaceC12932l) {
        this.yandex = c8137l;
        this.loadAd = c8322l;
        this.crashlytics = c17395l;
        this.amazon = c3982l;
        this.purchase = interfaceC15829l;
        this.billing = c4288l;
        this.mopub = interfaceC12932l;
        AbstractC10999l.mopub(AbstractC11990l.yandex(interfaceC12932l), null, 0, new C9609l(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(C14567l c14567l, String str, EnumC14549l enumC14549l, InterfaceC14029l interfaceC14029l) {
        C3657l c3657l;
        String str2;
        if (interfaceC14029l instanceof C3657l) {
            c3657l = (C3657l) interfaceC14029l;
            int i = c3657l.f7713l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3657l.f7713l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3657l = new C3657l(c14567l, interfaceC14029l);
            }
        } else {
            c3657l = new C3657l(c14567l, interfaceC14029l);
        }
        Object objLoadAd = c3657l.f7716l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c3657l.f7713l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            if (AbstractC8576l.yandex(c14567l.firebase, str)) {
                return Unit.INSTANCE;
            }
            c14567l.firebase = str;
            C4749l c4749l = C4749l.yandex;
            c3657l.f7715l = str;
            c3657l.f7714l = enumC14549l;
            c3657l.f7713l = 1;
            objLoadAd = c4749l.loadAd(c3657l);
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            enumC14549l = c3657l.f7714l;
            str = c3657l.f7715l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        for (C7747l c7747l : ((Map) objLoadAd).values()) {
            C6108l c6108l = new C6108l(str);
            c7747l.getClass();
            String str3 = "App Quality Sessions session changed: " + c6108l;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            C18449l c18449l = c7747l.loadAd;
            synchronized (c18449l) {
                if (!Objects.equals((String) c18449l.f36012l, str)) {
                    C18449l.m4533switch((C12714l) c18449l.f36010l, (String) c18449l.f36009l, str);
                    c18449l.f36012l = str;
                }
            }
            int iOrdinal = enumC14549l.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + EnumC9110l.f18712l + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return null;
                }
                str2 = "Notified " + EnumC9110l.f18712l + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return Unit.INSTANCE;
    }

    public final boolean amazon(C6539l c6539l) {
        Map map = c6539l.crashlytics;
        boolean z = true;
        C4288l c4288l = this.billing;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c4288l.yandex());
            return true;
        }
        C15120l c15120l = (C15120l) map.get(c4288l.yandex());
        if (c15120l != null && c15120l.yandex == c4288l.crashlytics && AbstractC8576l.yandex(c15120l.loadAd, (String) c4288l.amazon.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + c4288l.yandex() + " is stale");
        }
        return z;
    }

    public final void crashlytics() {
        this.subs = true;
        C6539l c6539l = this.admob;
        if (c6539l == null) {
            this.isPro = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.billing.yandex());
        if (purchase(c6539l) || amazon(c6539l)) {
            AbstractC10999l.mopub(AbstractC11990l.yandex(this.mopub), null, 0, new C7226l(this, c6539l, null, 27), 3);
        }
    }

    public final void loadAd() {
        this.subs = false;
        if (this.admob == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.billing.yandex());
        AbstractC10999l.mopub(AbstractC11990l.yandex(this.mopub), null, 0, new C9609l(this, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public final boolean purchase(C6539l c6539l) {
        C9658l c9658lCrashlytics;
        long jTapsense;
        C14801l c14801l = c6539l.loadAd;
        C18067l c18067l = c6539l.yandex;
        if (c14801l == null) {
            Log.d("FirebaseSessions", "Session " + c18067l.yandex + " has not backgrounded yet");
            return false;
        }
        C14801l c14801lYandex = this.amazon.yandex();
        C6760l c6760l = C9658l.f19699l;
        long jSignature = AbstractC15918l.Signature(c14801lYandex.yandex - c14801l.yandex, EnumC16636l.MILLISECONDS);
        C8137l c8137l = this.yandex;
        C9658l c9658lCrashlytics2 = c8137l.yandex.crashlytics();
        if (c9658lCrashlytics2 != null) {
            jTapsense = c9658lCrashlytics2.f19702l;
            if (jTapsense <= 0 || C9658l.billing(jTapsense)) {
                c9658lCrashlytics = c8137l.loadAd.crashlytics();
                if (c9658lCrashlytics != null) {
                    jTapsense = c9658lCrashlytics.f19702l;
                    if (jTapsense > 0 || C9658l.billing(jTapsense)) {
                        jTapsense = AbstractC15918l.tapsense(30, EnumC16636l.MINUTES);
                    }
                } else {
                    jTapsense = AbstractC15918l.tapsense(30, EnumC16636l.MINUTES);
                }
            }
        } else {
            c9658lCrashlytics = c8137l.loadAd.crashlytics();
            if (c9658lCrashlytics != null) {
                jTapsense = c9658lCrashlytics.f19702l;
                if (jTapsense > 0) {
                    jTapsense = AbstractC15918l.tapsense(30, EnumC16636l.MINUTES);
                } else {
                    jTapsense = AbstractC15918l.tapsense(30, EnumC16636l.MINUTES);
                }
            } else {
                jTapsense = AbstractC15918l.tapsense(30, EnumC16636l.MINUTES);
            }
        }
        boolean z = C9658l.crashlytics(jSignature, jTapsense) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + c18067l.yandex + " is expired");
        }
        return z;
    }
}
