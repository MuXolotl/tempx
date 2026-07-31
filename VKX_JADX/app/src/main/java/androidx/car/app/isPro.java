package androidx.car.app;

import android.os.IInterface;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.isPro;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import defpackage.C15277l;
import defpackage.InterfaceC6610l;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class isPro {
    public INavigationHost amazon;
    public IMediaPlaybackHost billing;
    public IConstraintHost crashlytics;
    public IAppHost loadAd;
    public ISuggestionHost purchase;
    public ICarHost yandex;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final IInterface yandex(String str) {
        if (this.yandex == null) {
            Log.e("CarApp.Dispatch", "Host is not bound when attempting to retrieve host service");
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals("constraints")) {
                        if (this.crashlytics == null) {
                            final int i = 1;
                            this.crashlytics = (IConstraintHost) androidx.car.app.utils.billing.purchase("getHost(Constraints)", new InterfaceC6610l(this) { // from class: lؚؑۜ

                                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                public final /* synthetic */ isPro f1124l;

                                {
                                    this.f1124l = this;
                                }

                                @Override // defpackage.InterfaceC6610l
                                public final Object call() {
                                    int i2 = i;
                                    isPro ispro = this.f1124l;
                                    switch (i2) {
                                        case 0:
                                            ICarHost iCarHost = ispro.yandex;
                                            Objects.requireNonNull(iCarHost);
                                            return IAppHost.Stub.asInterface(iCarHost.getHost("app"));
                                        case 1:
                                            ICarHost iCarHost2 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost2);
                                            return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                        case 2:
                                            ICarHost iCarHost3 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost3);
                                            return ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                                        case 3:
                                            ICarHost iCarHost4 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost4);
                                            return IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                                        default:
                                            ICarHost iCarHost5 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost5);
                                            return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                    }
                                }
                            });
                        }
                        return this.crashlytics;
                    }
                    break;
                case 96801:
                    if (str.equals("app")) {
                        if (this.loadAd == null) {
                            final int i2 = 0;
                            this.loadAd = (IAppHost) androidx.car.app.utils.billing.purchase("getHost(App)", new InterfaceC6610l(this) { // from class: lؚؑۜ

                                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                public final /* synthetic */ isPro f1124l;

                                {
                                    this.f1124l = this;
                                }

                                @Override // defpackage.InterfaceC6610l
                                public final Object call() {
                                    int i3 = i2;
                                    isPro ispro = this.f1124l;
                                    switch (i3) {
                                        case 0:
                                            ICarHost iCarHost = ispro.yandex;
                                            Objects.requireNonNull(iCarHost);
                                            return IAppHost.Stub.asInterface(iCarHost.getHost("app"));
                                        case 1:
                                            ICarHost iCarHost2 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost2);
                                            return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                        case 2:
                                            ICarHost iCarHost3 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost3);
                                            return ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                                        case 3:
                                            ICarHost iCarHost4 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost4);
                                            return IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                                        default:
                                            ICarHost iCarHost5 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost5);
                                            return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                    }
                                }
                            });
                        }
                        return this.loadAd;
                    }
                    break;
                case 98260:
                    if (str.equals("car")) {
                        return this.yandex;
                    }
                    break;
                case 1197722116:
                    if (str.equals("suggestion")) {
                        if (this.purchase == null) {
                            final int i3 = 2;
                            this.purchase = (ISuggestionHost) androidx.car.app.utils.billing.purchase("getHost(Suggestion)", new InterfaceC6610l(this) { // from class: lؚؑۜ

                                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                public final /* synthetic */ isPro f1124l;

                                {
                                    this.f1124l = this;
                                }

                                @Override // defpackage.InterfaceC6610l
                                public final Object call() {
                                    int i4 = i3;
                                    isPro ispro = this.f1124l;
                                    switch (i4) {
                                        case 0:
                                            ICarHost iCarHost = ispro.yandex;
                                            Objects.requireNonNull(iCarHost);
                                            return IAppHost.Stub.asInterface(iCarHost.getHost("app"));
                                        case 1:
                                            ICarHost iCarHost2 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost2);
                                            return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                        case 2:
                                            ICarHost iCarHost3 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost3);
                                            return ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                                        case 3:
                                            ICarHost iCarHost4 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost4);
                                            return IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                                        default:
                                            ICarHost iCarHost5 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost5);
                                            return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                    }
                                }
                            });
                        }
                        return this.purchase;
                    }
                    break;
                case 1569536022:
                    if (str.equals("media_playback")) {
                        if (this.billing == null) {
                            final int i4 = 3;
                            this.billing = (IMediaPlaybackHost) androidx.car.app.utils.billing.purchase("getHost(Media)", new InterfaceC6610l(this) { // from class: lؚؑۜ

                                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                public final /* synthetic */ isPro f1124l;

                                {
                                    this.f1124l = this;
                                }

                                @Override // defpackage.InterfaceC6610l
                                public final Object call() {
                                    int i5 = i4;
                                    isPro ispro = this.f1124l;
                                    switch (i5) {
                                        case 0:
                                            ICarHost iCarHost = ispro.yandex;
                                            Objects.requireNonNull(iCarHost);
                                            return IAppHost.Stub.asInterface(iCarHost.getHost("app"));
                                        case 1:
                                            ICarHost iCarHost2 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost2);
                                            return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                        case 2:
                                            ICarHost iCarHost3 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost3);
                                            return ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                                        case 3:
                                            ICarHost iCarHost4 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost4);
                                            return IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                                        default:
                                            ICarHost iCarHost5 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost5);
                                            return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                    }
                                }
                            });
                        }
                        return this.billing;
                    }
                    break;
                case 1862666772:
                    if (str.equals("navigation")) {
                        if (this.amazon == null) {
                            final int i5 = 4;
                            this.amazon = (INavigationHost) androidx.car.app.utils.billing.purchase("getHost(Navigation)", new InterfaceC6610l(this) { // from class: lؚؑۜ

                                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                public final /* synthetic */ isPro f1124l;

                                {
                                    this.f1124l = this;
                                }

                                @Override // defpackage.InterfaceC6610l
                                public final Object call() {
                                    int i6 = i5;
                                    isPro ispro = this.f1124l;
                                    switch (i6) {
                                        case 0:
                                            ICarHost iCarHost = ispro.yandex;
                                            Objects.requireNonNull(iCarHost);
                                            return IAppHost.Stub.asInterface(iCarHost.getHost("app"));
                                        case 1:
                                            ICarHost iCarHost2 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost2);
                                            return IConstraintHost.Stub.asInterface(iCarHost2.getHost("constraints"));
                                        case 2:
                                            ICarHost iCarHost3 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost3);
                                            return ISuggestionHost.Stub.asInterface(iCarHost3.getHost("suggestion"));
                                        case 3:
                                            ICarHost iCarHost4 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost4);
                                            return IMediaPlaybackHost.Stub.asInterface(iCarHost4.getHost("media_playback"));
                                        default:
                                            ICarHost iCarHost5 = ispro.yandex;
                                            Objects.requireNonNull(iCarHost5);
                                            return INavigationHost.Stub.asInterface(iCarHost5.getHost("navigation"));
                                    }
                                }
                            });
                        }
                        return this.amazon;
                    }
                    break;
            }
            throw new InvalidParameterException("Invalid host type: ".concat(str));
        } catch (C15277l unused) {
            Log.e("CarApp.Dispatch", "Host threw an exception when attempting to retrieve host service");
            return null;
        }
    }
}
