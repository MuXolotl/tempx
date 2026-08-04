package defpackage;

import android.util.Log;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: lۣؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4271l {
    public LinkedHashMap admob;
    public final C9395l amazon;
    public C11268l billing;
    public final InterfaceC6128l crashlytics;
    public final C4723l loadAd;
    public C9426l subs;
    public final C14338l yandex;
    public final Object purchase = new Object();
    public final LinkedHashMap mopub = new LinkedHashMap();

    public C4271l(C14338l c14338l, C4723l c4723l, InterfaceC6128l interfaceC6128l, C9395l c9395l) {
        this.yandex = c14338l;
        this.loadAd = c4723l;
        this.crashlytics = interfaceC6128l;
        this.amazon = c9395l;
    }

    public static InterfaceC1142l billing(C4271l c4271l, C2667l c2667l, C9395l c9395l, Map map) {
        InterfaceC1142l interfaceC1142lYandex;
        synchronized (c4271l.purchase) {
            try {
                if (c4271l.billing != null) {
                    throw new IllegalStateException("Surfaces should only be set up once!");
                }
                if (c4271l.subs != null) {
                    throw new IllegalStateException("Surfaces being setup after stopped!");
                }
                if (c4271l.admob != null) {
                    throw new IllegalStateException("Check failed.");
                }
                List list = (List) c9395l.mopub.getValue();
                InterfaceC14029l interfaceC14029l = null;
                try {
                    AbstractC7741l.subs(list);
                    C11268l c11268lCrashlytics = AbstractC10999l.crashlytics(3, null, c4271l.yandex.yandex, new C1914l(c9395l, c4271l, list, map, c2667l, (InterfaceC14029l) null));
                    c11268lCrashlytics.mo2154l(new C12249l(2, list));
                    c4271l.billing = c11268lCrashlytics;
                    interfaceC1142lYandex = c11268lCrashlytics;
                } catch (C4201l e) {
                    if (AbstractC5088l.metrica()) {
                        Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                    }
                    AbstractC10999l.mopub(c4271l.yandex.yandex, null, 0, new C4781l(c9395l, e, interfaceC14029l, 0), 3);
                    interfaceC1142lYandex = AbstractC15929l.yandex(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1142lYandex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object crashlytics(C4271l c4271l, AbstractC0283l abstractC0283l) {
        C18557l c18557l;
        if (abstractC0283l instanceof C18557l) {
            c18557l = (C18557l) abstractC0283l;
            int i = c18557l.f36234l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18557l.f36234l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18557l = new C18557l(c4271l, abstractC0283l);
            }
        } else {
            c18557l = new C18557l(c4271l, abstractC0283l);
        }
        Object obj = c18557l.f36233l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c18557l.f36234l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            synchronized (c4271l.purchase) {
                C11268l c11268l = c4271l.billing;
                if (c11268l == null || c4271l.subs != null) {
                    return Boolean.FALSE;
                }
                c18557l.f36234l = 1;
                Object objFirebase = c11268l.firebase(c18557l);
                return objFirebase == enumC9342l ? enumC9342l : objFirebase;
            }
        } catch (CancellationException unused) {
            if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "Surface setup was cancelled");
            }
            return Boolean.FALSE;
        }
    }

    public static final void loadAd(C4271l c4271l) {
        Set setKeySet;
        C12292l c12292lYandex = c4271l.loadAd.yandex();
        synchronized (c12292lYandex.yandex) {
            try {
                c12292lYandex.crashlytics.add(c4271l);
                LinkedHashMap linkedHashMap = c12292lYandex.loadAd;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            c4271l.amazon((Surface) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(C4271l c4271l, List list, long j, AbstractC0283l abstractC0283l) {
        C17263l c17263l;
        if (abstractC0283l instanceof C17263l) {
            c17263l = (C17263l) abstractC0283l;
            int i = c17263l.f33494l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17263l.f33494l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17263l = new C17263l(c4271l, abstractC0283l);
            }
        } else {
            c17263l = new C17263l(c4271l, abstractC0283l);
        }
        Object objAdmob = c17263l.f33493l;
        int i2 = c17263l.f33494l;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C16177l c16177l = new C16177l(i3, interfaceC14029l, list);
            c17263l.f33494l = 1;
            objAdmob = AbstractC15342l.admob(j, c16177l, c17263l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        List list2 = (List) objAdmob;
        return list2 == null ? C2580l.f5619l : list2;
    }

    public final void amazon(Surface surface) {
        AbstractC0958l abstractC0958l;
        synchronized (this.purchase) {
            try {
                LinkedHashMap linkedHashMap = this.admob;
                if (linkedHashMap != null && (abstractC0958l = (AbstractC0958l) linkedHashMap.get(surface)) != null) {
                    if (!this.mopub.containsKey(surface)) {
                        if (AbstractC5088l.firebase("CXCP")) {
                            Log.d("CXCP", "SurfaceActive " + abstractC0958l + " in " + this);
                        }
                        this.mopub.put(surface, abstractC0958l);
                        try {
                            abstractC0958l.amazon();
                        } catch (C4201l e) {
                            if (AbstractC5088l.metrica()) {
                                Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                            }
                            this.amazon.yandex(e.f8621l);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mopub() {
        synchronized (this.purchase) {
            try {
                if (this.mopub.isEmpty() && this.admob == null) {
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    this.loadAd.yandex().loadAd(this);
                    C9426l c9426l = this.subs;
                    if (c9426l != null) {
                        c9426l.m3885new(Unit.INSTANCE);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void purchase(Surface surface) {
        synchronized (this.purchase) {
            try {
                AbstractC0958l abstractC0958l = (AbstractC0958l) this.mopub.remove(surface);
                if (abstractC0958l != null) {
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "SurfaceInactive " + abstractC0958l + " in " + this);
                    }
                    this.crashlytics.metrica(abstractC0958l);
                    try {
                        abstractC0958l.loadAd();
                    } catch (IllegalStateException e) {
                        if (AbstractC5088l.metrica()) {
                            Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                        }
                    }
                    mopub();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
