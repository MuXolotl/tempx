package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lًۚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8257l extends C9912l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C16222l f17152l = new C16222l(14);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static C8257l f17153l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Application f17154l;

    public C8257l(Application application) {
        super(14);
        this.f17154l = application;
    }

    public static AbstractC4350l tapsense(Class cls, Application application) {
        if (!AbstractC11434l.class.isAssignableFrom(cls)) {
            return AbstractC16655l.yandex(cls);
        }
        try {
            return (AbstractC4350l) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // defpackage.C9912l, defpackage.InterfaceC11893l
    public final AbstractC4350l mopub(Class cls, C3806l c3806l) {
        if (this.f17154l != null) {
            return purchase(cls);
        }
        Application application = (Application) c3806l.yandex.get(f17152l);
        if (application != null) {
            return tapsense(cls, application);
        }
        if (!AbstractC11434l.class.isAssignableFrom(cls)) {
            return AbstractC16655l.yandex(cls);
        }
        C8339l.metrica("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // defpackage.C9912l, defpackage.InterfaceC11893l
    public final AbstractC4350l purchase(Class cls) {
        Application application = this.f17154l;
        if (application != null) {
            return tapsense(cls, application);
        }
        C10754l.ads("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
