package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import defpackage.AbstractC11621l;
import defpackage.BinderC1157l;
import defpackage.C18725l;
import defpackage.C6772l;
import defpackage.InterfaceC4716l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public WeakReference f33l;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InterfaceC4716l interfaceC4716l;
        yandex yandexVar = (yandex) this.f33l.get();
        if (yandexVar == null || bundle == null) {
            return;
        }
        synchronized (yandexVar.loadAd) {
            try {
                MediaSessionCompat$Token mediaSessionCompat$Token = yandexVar.purchase;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i2 = loadAd.billing;
                if (binder == null) {
                    interfaceC4716l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4716l)) {
                        C6772l c6772l = new C6772l();
                        c6772l.purchase = binder;
                        interfaceC4716l = c6772l;
                    } else {
                        interfaceC4716l = (InterfaceC4716l) iInterfaceQueryLocalInterface;
                    }
                }
                mediaSessionCompat$Token.loadAd(interfaceC4716l);
                yandexVar.purchase.crashlytics(AbstractC11621l.billing(bundle));
                ArrayList arrayList = yandexVar.crashlytics;
                if (yandexVar.purchase.yandex() != null) {
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        arrayList.clear();
                    } else {
                        if (it.next() == null) {
                            yandexVar.amazon.put(null, new BinderC1157l());
                            throw null;
                        }
                        C18725l.loadAd();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
