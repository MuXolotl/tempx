package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.AbstractC1051l;
import defpackage.AbstractC14886l;
import defpackage.C1226l;
import defpackage.C18073l;
import defpackage.C3412l;
import defpackage.C4875l;
import defpackage.C7269l;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            AbstractC14886l.loadAd(this.mContext);
        } catch (C1226l unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        } catch (C3412l unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        C7269l c7269l;
        try {
            AbstractC14886l.loadAd(this.mContext);
            try {
                synchronized (AbstractC14886l.loadAd) {
                    c7269l = AbstractC14886l.crashlytics;
                }
                AbstractC1051l.subs(c7269l);
                ClassLoader classLoader = c7269l.yandex.getClassLoader();
                AbstractC1051l.subs(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                AbstractC1051l.isPro(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            C18073l.Signature("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (C1226l e2) {
            C4875l.remoteconfig("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
            return null;
        } catch (C3412l e3) {
            C4875l.remoteconfig("Google Play Services Cronet provider is unavailable on this device.", e3);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (AbstractC14886l.loadAd) {
            str = AbstractC14886l.amazon;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        C7269l c7269l;
        tryToInstallCronetProvider();
        synchronized (AbstractC14886l.loadAd) {
            c7269l = AbstractC14886l.crashlytics;
        }
        return c7269l != null;
    }
}
