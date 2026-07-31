package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC1051l;
import defpackage.AbstractC14425l;
import defpackage.C10819l;
import defpackage.C12186l;
import defpackage.C14184l;
import defpackage.C1652l;
import defpackage.C16936l;
import defpackage.C18110l;
import defpackage.C2825l;
import defpackage.C4652l;
import defpackage.C9471l;
import defpackage.ExecutorC12908l;
import defpackage.InterfaceC0478l;
import defpackage.InterfaceC14242l;
import defpackage.InterfaceC6235l;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC6235l lambda$getComponents$0(InterfaceC0478l interfaceC0478l) {
        C14184l c14184l = (C14184l) interfaceC0478l.remoteconfig(C14184l.class);
        Context context = (Context) interfaceC0478l.remoteconfig(Context.class);
        InterfaceC14242l interfaceC14242l = (InterfaceC14242l) interfaceC0478l.remoteconfig(InterfaceC14242l.class);
        AbstractC1051l.subs(c14184l);
        AbstractC1051l.subs(context);
        AbstractC1051l.subs(interfaceC14242l);
        AbstractC1051l.subs(context.getApplicationContext());
        if (C18110l.crashlytics == null) {
            synchronized (C18110l.class) {
                try {
                    if (C18110l.crashlytics == null) {
                        Bundle bundle = new Bundle(1);
                        c14184l.yandex();
                        if ("[DEFAULT]".equals(c14184l.loadAd)) {
                            ((C2825l) interfaceC14242l).yandex(ExecutorC12908l.f25367l, C10819l.f21871l);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c14184l.admob());
                        }
                        C18110l.crashlytics = new C18110l(C9471l.crashlytics(context, bundle).loadAd);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C18110l.crashlytics;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C4652l> getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(InterfaceC6235l.class);
        c1652lLoadAd.yandex(C12186l.loadAd(C14184l.class));
        c1652lLoadAd.yandex(C12186l.loadAd(Context.class));
        c1652lLoadAd.yandex(C12186l.loadAd(InterfaceC14242l.class));
        c1652lLoadAd.mopub = C16936l.f33019l;
        c1652lLoadAd.crashlytics(2);
        return Arrays.asList(c1652lLoadAd.loadAd(), AbstractC14425l.yandex("fire-analytics", "23.2.0"));
    }
}
