package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lؔۨۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3090l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f6627l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6628l;

    public /* synthetic */ C3090l(Context context, int i) {
        this.f6628l = i;
        this.f6627l = context;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        int i = this.f6628l;
        Context context = this.f6627l;
        switch (i) {
            case 0:
                Object obj = C7447l.isPro;
                final C1424l c1424l = new C1424l();
                c1424l.f3603l = context;
                context.getClass();
                if (((InterfaceC11766l) c1424l.f3602l) == null) {
                    c1424l.f3602l = C7447l.remoteconfig;
                }
                final int i2 = 1;
                if (((InterfaceC11766l) c1424l.f3601l) == null) {
                    c1424l.f3601l = AbstractC15788l.purchase(new C3090l((Context) c1424l.f3603l, i2));
                }
                if (((C17782l) c1424l.f3605l) == null) {
                    c1424l.f3605l = new InterfaceC11766l() { // from class: lٌ٘ؑ
                        @Override // defpackage.InterfaceC11766l
                        public final Object get() {
                            int i3 = i2;
                            C1424l c1424l2 = c1424l;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) c1424l2.f3603l;
                                    Object obj2 = C7447l.isPro;
                                    try {
                                        return AbstractC17238l.amazon(context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return C1972l.f4482l;
                                    }
                                default:
                                    return new C13464l(new C6305l((InterfaceC11766l) c1424l2.f3602l));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((InterfaceC11766l) c1424l.f3604l) == null) {
                    Context context2 = (Context) c1424l.f3603l;
                    ArrayList arrayList = new ArrayList();
                    C18675l c18675l = new C18675l();
                    new ConcurrentHashMap();
                    AbstractC16181l.isPro(context2 != null, "Context cannot be null", new Object[0]);
                    c18675l.f36444l = context2.getApplicationContext();
                    C17525l c17525l = new C17525l(c18675l);
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, c17525l, new C11701l());
                    c1424l.f3604l = AbstractC15788l.purchase(new C15752l(i3, arrayList));
                }
                if (((C17782l) c1424l.f3606l) == null) {
                    c1424l.f3606l = new InterfaceC11766l() { // from class: lٌ٘ؑ
                        @Override // defpackage.InterfaceC11766l
                        public final Object get() {
                            int i4 = i3;
                            C1424l c1424l2 = c1424l;
                            switch (i4) {
                                case 0:
                                    Context context3 = (Context) c1424l2.f3603l;
                                    Object obj2 = C7447l.isPro;
                                    try {
                                        return AbstractC17238l.amazon(context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return C1972l.f4482l;
                                    }
                                default:
                                    return new C13464l(new C6305l((InterfaceC11766l) c1424l2.f3602l));
                            }
                        }
                    };
                }
                return new C7447l((Context) c1424l.f3603l, (InterfaceC11766l) c1424l.f3602l, (InterfaceC11766l) c1424l.f3601l, (C17782l) c1424l.f3605l, (InterfaceC11766l) c1424l.f3604l, (C17782l) c1424l.f3606l);
            case 1:
                Object obj2 = C7447l.isPro;
                return new C18222l(new C1539l(context, AbstractC3778l.yandex, InterfaceC13945l.yandex, C1308l.crashlytics));
            default:
                Object obj3 = AbstractC5791l.yandex;
                return AbstractC11965l.appmetrica(context);
        }
    }
}
