package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15581l {
    public static final /* synthetic */ InterfaceC13922l[] amazon = {AbstractC18202l.yandex.subs(new C7953l(C15581l.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    public final InterfaceC15829l crashlytics;
    public final ThreadLocal loadAd = new ThreadLocal();
    public final String yandex;

    /* JADX WARN: Type inference failed for: r1v1, types: [lًٕٗ] */
    public C15581l(Context context, String str) {
        this.yandex = str;
        final int i = 0;
        C7972l c7972l = new C7972l(23, new Function1(this) { // from class: lًٕٗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15581l f16748l;

            {
                this.f16748l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                int i3 = 1;
                boolean z = true;
                C15581l c15581l = this.f16748l;
                switch (i2) {
                    case 0:
                        Log.w(AbstractC18202l.yandex.loadAd(C15581l.class).license(), "CorruptionException in " + c15581l.yandex + " DataStore running in process " + Process.myPid(), (C16916l) obj);
                        return new C16221l(z ? 1 : 0);
                    default:
                        Context context2 = (Context) obj;
                        String str2 = c15581l.yandex;
                        InterfaceC14029l interfaceC14029l = null;
                        int i4 = 3;
                        return Collections.singletonList(new C14042l(new C15245l(i4, context2, str2), AbstractC11824l.yandex, new C9211l(AbstractC13430l.yandex, interfaceC14029l, i3), new C13749l(i4, interfaceC14029l, 8), context2, str2));
                }
            }
        });
        final int i2 = 1;
        C6286l c6286lCrashlytics = AbstractC3925l.crashlytics(str, c7972l, new Function1(this) { // from class: lًٕٗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15581l f16748l;

            {
                this.f16748l = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                int i4 = 1;
                boolean z = true;
                C15581l c15581l = this.f16748l;
                switch (i3) {
                    case 0:
                        Log.w(AbstractC18202l.yandex.loadAd(C15581l.class).license(), "CorruptionException in " + c15581l.yandex + " DataStore running in process " + Process.myPid(), (C16916l) obj);
                        return new C16221l(z ? 1 : 0);
                    default:
                        Context context2 = (Context) obj;
                        String str2 = c15581l.yandex;
                        InterfaceC14029l interfaceC14029l = null;
                        int i5 = 3;
                        return Collections.singletonList(new C14042l(new C15245l(i5, context2, str2), AbstractC11824l.yandex, new C9211l(AbstractC13430l.yandex, interfaceC14029l, i4), new C13749l(i5, interfaceC14029l, 8), context2, str2));
                }
            }
        }, 8);
        InterfaceC13922l interfaceC13922l = amazon[0];
        this.crashlytics = (InterfaceC15829l) c6286lCrashlytics.yandex(context);
    }

    public final void yandex(Function1 function1) {
    }
}
