package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6421l extends AbstractC3868l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final AbstractC9637l f13439l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C5885l f13440l = new C5885l(AbstractC6421l.class);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public volatile Set f13441l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public volatile int f13442l;

    static {
        Throwable th;
        AbstractC9637l c4002l;
        try {
            c4002l = new C16202l(AtomicReferenceFieldUpdater.newUpdater(AbstractC6421l.class, Set.class, "lؕؕؒ"), AtomicIntegerFieldUpdater.newUpdater(AbstractC6421l.class, "lٜٓٓ"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c4002l = new C4002l();
        }
        f13439l = c4002l;
        if (th != null) {
            f13440l.yandex().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
