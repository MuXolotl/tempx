package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.AbstractC1051l;
import defpackage.AbstractC12366l;
import defpackage.AbstractC13844l;
import defpackage.C0528l;
import defpackage.C10777l;
import defpackage.C16351l;
import defpackage.C17417l;
import defpackage.InterfaceC15438l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement loadAd;
    public final AbstractC13844l yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C17417l c17417l) {
        this.yandex = new C0528l(c17417l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (loadAd == null) {
            synchronized (AppMeasurement.class) {
                if (loadAd == null) {
                    InterfaceC15438l interfaceC15438l = (InterfaceC15438l) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC15438l != null) {
                        loadAd = new AppMeasurement(interfaceC15438l);
                    } else {
                        loadAd = new AppMeasurement(C17417l.vip(context, new C16351l(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return loadAd;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.yandex.adcel(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.yandex.ads(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.yandex.startapp(str);
    }

    @Keep
    public long generateEventId() {
        return this.yandex.remoteconfig();
    }

    @Keep
    public String getAppInstanceId() {
        return this.yandex.Signature();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listSubscription = this.yandex.subscription(str, str2);
        ArrayList arrayList = new ArrayList(listSubscription == null ? 0 : listSubscription.size());
        for (Bundle bundle : listSubscription) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            AbstractC1051l.subs(bundle);
            conditionalUserProperty.mAppId = (String) AbstractC12366l.purchase(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) AbstractC12366l.purchase(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) AbstractC12366l.purchase(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = AbstractC12366l.purchase(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) AbstractC12366l.purchase(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) AbstractC12366l.purchase(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) AbstractC12366l.purchase(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) AbstractC12366l.purchase(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) AbstractC12366l.purchase(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) AbstractC12366l.purchase(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) AbstractC12366l.purchase(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) AbstractC12366l.purchase(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) AbstractC12366l.purchase(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) AbstractC12366l.purchase(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) AbstractC12366l.purchase(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) AbstractC12366l.purchase(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.yandex.vip();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.yandex.admob();
    }

    @Keep
    public String getGmpAppId() {
        return this.yandex.license();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.yandex.tapsense(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.yandex.pro(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.yandex.subs(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC1051l.subs(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC12366l.amazon(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.yandex.metrica(bundle);
    }

    public AppMeasurement(InterfaceC15438l interfaceC15438l) {
        this.yandex = new C10777l(interfaceC15438l);
    }
}
