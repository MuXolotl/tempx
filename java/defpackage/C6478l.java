package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٌؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6478l implements InterfaceC11893l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Bundle f13528l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8257l f13529l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Application f13530l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C18396l f13531l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC6475l f13532l;

    public C6478l(Application application, InterfaceC3187l interfaceC3187l, Bundle bundle) {
        C8257l c8257l;
        this.f13531l = interfaceC3187l.metrica();
        this.f13532l = interfaceC3187l.loadAd();
        this.f13528l = bundle;
        this.f13530l = application;
        if (application != null) {
            if (C8257l.f17153l == null) {
                C8257l.f17153l = new C8257l(application);
            }
            c8257l = C8257l.f17153l;
        } else {
            c8257l = new C8257l(null);
        }
        this.f13529l = c8257l;
    }

    @Override // defpackage.InterfaceC11893l
    public final AbstractC4350l isPro(InterfaceC1388l interfaceC1388l, C3806l c3806l) {
        return mopub(((InterfaceC13937l) interfaceC1388l).mo1730private(), c3806l);
    }

    @Override // defpackage.InterfaceC11893l
    public final AbstractC4350l mopub(Class cls, C3806l c3806l) {
        LinkedHashMap linkedHashMap = c3806l.yandex;
        String str = (String) linkedHashMap.get(AbstractC7237l.yandex);
        if (str == null) {
            C8339l.smaato("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(AbstractC6531l.yandex) == null || linkedHashMap.get(AbstractC6531l.loadAd) == null) {
            if (this.f13532l != null) {
                return yandex(cls, str);
            }
            C8339l.smaato("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(C8257l.f17152l);
        boolean zIsAssignableFrom = AbstractC11434l.class.isAssignableFrom(cls);
        Constructor constructorYandex = (!zIsAssignableFrom || application == null) ? AbstractC17996l.yandex(cls, AbstractC17996l.loadAd) : AbstractC17996l.yandex(cls, AbstractC17996l.yandex);
        if (constructorYandex == null) {
            return this.f13529l.mopub(cls, c3806l);
        }
        return (!zIsAssignableFrom || application == null) ? AbstractC17996l.loadAd(cls, constructorYandex, AbstractC6531l.yandex(c3806l)) : AbstractC17996l.loadAd(cls, constructorYandex, application, AbstractC6531l.yandex(c3806l));
    }

    @Override // defpackage.InterfaceC11893l
    public final AbstractC4350l purchase(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return yandex(cls, canonicalName);
        }
        C8339l.metrica("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final AbstractC4350l yandex(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC6475l abstractC6475l = this.f13532l;
        if (abstractC6475l == null) {
            C10754l.ads("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC11434l.class.isAssignableFrom(cls);
        Constructor constructorYandex = (!zIsAssignableFrom || this.f13530l == null) ? AbstractC17996l.yandex(cls, AbstractC17996l.loadAd) : AbstractC17996l.yandex(cls, AbstractC17996l.yandex);
        if (constructorYandex == null) {
            if (this.f13530l != null) {
                return this.f13529l.purchase(cls);
            }
            if (C9912l.f20177l == null) {
                C9912l.f20177l = new C9912l(14);
            }
            C9912l.f20177l.getClass();
            return AbstractC16655l.yandex(cls);
        }
        C18396l c18396l = this.f13531l;
        C1453l c1453lLoadAd = AbstractC18377l.loadAd(c18396l.tapsense(str), this.f13528l);
        C11596l c11596l = new C11596l(str, c1453lLoadAd);
        c11596l.yandex(c18396l, abstractC6475l);
        EnumC8981l enumC8981l = ((C5268l) abstractC6475l).subs;
        int i = 1;
        if (enumC8981l == EnumC8981l.f18521l || enumC8981l.yandex(EnumC8981l.f18524l)) {
            c18396l.m4524native();
        } else {
            abstractC6475l.yandex(new C14852l(abstractC6475l, c18396l, i));
        }
        AbstractC4350l abstractC4350lLoadAd = (!zIsAssignableFrom || (application = this.f13530l) == null) ? AbstractC17996l.loadAd(cls, constructorYandex, c1453lLoadAd) : AbstractC17996l.loadAd(cls, constructorYandex, application, c1453lLoadAd);
        C14697l c14697l = abstractC4350lLoadAd.yandex;
        if (c14697l == null) {
            return abstractC4350lLoadAd;
        }
        if (c14697l.amazon) {
            C14697l.yandex(c11596l);
            return abstractC4350lLoadAd;
        }
        synchronized (c14697l.yandex) {
            autoCloseable = (AutoCloseable) c14697l.loadAd.put("androidx.lifecycle.savedstate.vm.tag", c11596l);
        }
        C14697l.yandex(autoCloseable);
        return abstractC4350lLoadAd;
    }
}
