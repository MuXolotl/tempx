package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: lْ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17636l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f34321l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34322l;

    public /* synthetic */ C17636l(Context context, int i) {
        this.f34322l = i;
        this.f34321l = context;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        C7713l c7713l;
        int i = this.f34322l;
        Context context = this.f34321l;
        switch (i) {
            case 0:
                return AbstractC13950l.vip(context);
            case 1:
                return new C16717l(context);
            default:
                C13708l c13708l = C7713l.startapp;
                synchronized (C7713l.class) {
                    try {
                        if (C7713l.license == null) {
                            Context applicationContext = context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            C7713l.license = new C7713l(applicationContext, map);
                        }
                        c7713l = C7713l.license;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c7713l;
        }
    }
}
