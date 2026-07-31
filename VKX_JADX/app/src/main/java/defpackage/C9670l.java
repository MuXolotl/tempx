package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: renamed from: lٍٚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9670l {
    public static final C0022l subs = new C0022l("ApplicationAnalytics", null);
    public C0189l admob;
    public final SharedPreferences billing;
    public final C8292l crashlytics;
    public final BinderC11031l loadAd;
    public C14514l mopub;
    public final C4039l yandex;
    public final HandlerC4052l purchase = new HandlerC4052l(Looper.getMainLooper(), 6);
    public final RunnableC10799l amazon = new RunnableC10799l(9, this);

    public C9670l(SharedPreferences sharedPreferences, C4039l c4039l, BinderC11031l binderC11031l, Bundle bundle, String str) {
        this.billing = sharedPreferences;
        this.yandex = c4039l;
        this.loadAd = binderC11031l;
        this.crashlytics = new C8292l(str, bundle);
    }

    public final boolean admob(String str) {
        String str2;
        if (!mopub()) {
            return false;
        }
        AbstractC1051l.subs(this.mopub);
        if (str != null && (str2 = this.mopub.billing) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        subs.loadAd("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    public final void amazon() {
        CastDevice castDevice;
        subs.loadAd("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C14514l c14514l = new C14514l(this.loadAd);
        C14514l.ads++;
        this.mopub = c14514l;
        C0189l c0189l = this.admob;
        c14514l.metrica = c0189l != null && c0189l.mopub.m1241l();
        C14514l c14514l2 = this.mopub;
        AbstractC1051l.subs(c14514l2);
        C0022l c0022l = C15504l.isPro;
        AbstractC1051l.purchase("Must be called from the main thread.");
        C15504l c15504l = C15504l.smaato;
        AbstractC1051l.subs(c15504l);
        AbstractC1051l.purchase("Must be called from the main thread.");
        c14514l2.loadAd = c15504l.amazon.f24036l;
        C0189l c0189l2 = this.admob;
        if (c0189l2 == null) {
            castDevice = null;
        } else {
            AbstractC1051l.purchase("Must be called from the main thread.");
            castDevice = c0189l2.firebase;
        }
        if (castDevice != null) {
            billing(castDevice);
        }
        C14514l c14514l3 = this.mopub;
        AbstractC1051l.subs(c14514l3);
        C0189l c0189l3 = this.admob;
        c14514l3.startapp = c0189l3 != null ? c0189l3.loadAd() : 0;
        AbstractC1051l.subs(this.mopub);
    }

    public final void billing(CastDevice castDevice) {
        C14514l c14514l = this.mopub;
        if (c14514l == null) {
            return;
        }
        c14514l.crashlytics = castDevice.f533l;
        c14514l.mopub = castDevice.f534l.f28392l;
        c14514l.admob = castDevice.f531l;
        c14514l.vip = castDevice.admob();
        C7851l c7851lMopub = castDevice.mopub();
        if (c7851lMopub != null) {
            String str = c7851lMopub.f16382l;
            if (str != null) {
                c14514l.subs = str;
            }
            String str2 = c7851lMopub.f16381l;
            if (str2 != null) {
                c14514l.isPro = str2;
            }
            String str3 = c7851lMopub.f16384l;
            if (str3 != null) {
                c14514l.firebase = str3;
            }
            String str4 = c7851lMopub.f16376l;
            if (str4 != null) {
                c14514l.smaato = str4;
            }
            String str5 = c7851lMopub.f16377l;
            if (str5 != null) {
                c14514l.remoteconfig = str5;
            }
        }
    }

    public final void crashlytics() {
        HandlerC4052l handlerC4052l = this.purchase;
        AbstractC1051l.subs(handlerC4052l);
        RunnableC10799l runnableC10799l = this.amazon;
        AbstractC1051l.subs(runnableC10799l);
        handlerC4052l.postDelayed(runnableC10799l, 300000L);
    }

    public final void loadAd(int i) {
        subs.loadAd("log session ended with error = %d", Integer.valueOf(i));
        purchase();
        this.yandex.yandex(this.crashlytics.yandex(this.mopub, i), 228);
        this.purchase.removeCallbacks(this.amazon);
        this.mopub = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean mopub() {
        String str;
        C0022l c0022l = subs;
        if (this.mopub == null) {
            c0022l.loadAd("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        C0022l c0022l2 = C15504l.isPro;
        AbstractC1051l.purchase("Must be called from the main thread.");
        C15504l c15504l = C15504l.smaato;
        AbstractC1051l.subs(c15504l);
        AbstractC1051l.purchase("Must be called from the main thread.");
        String str2 = c15504l.amazon.f24036l;
        if (str2 == null || (str = this.mopub.loadAd) == null || !TextUtils.equals(str, str2)) {
            c0022l.loadAd("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        AbstractC1051l.subs(this.mopub);
        return true;
    }

    public final void purchase() {
        CastDevice castDevice;
        if (!mopub()) {
            C0022l c0022l = subs;
            Log.w(c0022l.yandex, c0022l.amazon("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            amazon();
            return;
        }
        C0189l c0189l = this.admob;
        if (c0189l != null) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            castDevice = c0189l.firebase;
        } else {
            castDevice = null;
        }
        if (castDevice != null && !TextUtils.equals(this.mopub.crashlytics, castDevice.f533l)) {
            billing(castDevice);
        }
        AbstractC1051l.subs(this.mopub);
    }

    public final void yandex() {
        C14514l c14514l = this.mopub;
        c14514l.getClass();
        SharedPreferences sharedPreferences = this.billing;
        if (sharedPreferences == null) {
            return;
        }
        C14514l.adcel.loadAd("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("application_id", c14514l.loadAd);
        editorEdit.putString("receiver_metrics_id", c14514l.crashlytics);
        editorEdit.putLong("analytics_session_id", c14514l.amazon);
        editorEdit.putInt("event_sequence_number", c14514l.purchase);
        editorEdit.putString("receiver_session_id", c14514l.billing);
        editorEdit.putInt("device_capabilities", c14514l.mopub);
        editorEdit.putString("device_model_name", c14514l.admob);
        editorEdit.putString("manufacturer", c14514l.subs);
        editorEdit.putString("product_name", c14514l.isPro);
        editorEdit.putString("build_type", c14514l.firebase);
        editorEdit.putString("cast_build_version", c14514l.smaato);
        editorEdit.putString("system_build_number", c14514l.remoteconfig);
        editorEdit.putInt("device_category", c14514l.vip);
        editorEdit.putInt("analytics_session_start_type", c14514l.startapp);
        editorEdit.putBoolean("is_output_switcher_enabled", c14514l.metrica);
        editorEdit.apply();
    }
}
