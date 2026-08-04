package defpackage;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ٛؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C18028l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f35306l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f35307l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35308l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f35309l;

    public /* synthetic */ C18028l(Object obj, Object obj2, Object obj3, int i) {
        this.f35308l = i;
        this.f35307l = obj;
        this.f35306l = obj2;
        this.f35309l = obj3;
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AssertionError admob(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((C16412l) this.f35307l), th);
        C16412l.purchase(assertionError);
        return assertionError;
    }

    public AssertionError billing(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC12766l.f25151l + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((C16412l) this.f35307l));
        C16412l.purchase(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:92:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:92:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:92:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:92:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:92:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1), top: B:90:0x0088, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        Object objPut;
        C6921l c6921lAmazon;
        int i = this.f35308l;
        Object obj2 = this.f35309l;
        Object obj3 = this.f35306l;
        Object obj4 = this.f35307l;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((C18583l) obj).yandex;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj3;
                C15178l c15178l = (C15178l) obj4;
                if (!c15178l.loadAd()) {
                    interfaceC8714l.setValue(Boolean.FALSE);
                } else if (AbstractC16422l.purchase(keyEvent) == 2 && AbstractC5072l.yandex(AbstractC0593l.yandex(keyEvent.getKeyCode()), AbstractC5072l.Signature)) {
                    ((InterfaceC8714l) obj2).setValue(Boolean.FALSE);
                    c15178l.yandex();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                C16412l c16412l = (C16412l) obj4;
                C1461l c1461l = c16412l.loadAd;
                InterfaceC2082l interfaceC2082l = c16412l.yandex;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj3;
                Object obj5 = concurrentHashMap.get(obj);
                Object obj6 = AbstractC12408l.yandex;
                AssertionError assertionErrorMopub = null;
                EnumC12766l enumC12766l = EnumC12766l.f25151l;
                if (obj5 != null && obj5 != enumC12766l) {
                    AbstractC12408l.yandex(obj5);
                    if (obj5 == obj6) {
                        return null;
                    }
                    return obj5;
                }
                interfaceC2082l.lock();
                try {
                    Object objInvoke = concurrentHashMap.get(obj);
                    EnumC12766l enumC12766l2 = EnumC12766l.f25150l;
                    if (objInvoke == enumC12766l) {
                        C6921l c6921lAmazon2 = c16412l.amazon(obj, "");
                        if (c6921lAmazon2 == null) {
                            yandex(3);
                            throw null;
                        }
                        if (c6921lAmazon2.f14494l) {
                            objInvoke = enumC12766l2;
                            if (objInvoke != enumC12766l2) {
                                c6921lAmazon = c16412l.amazon(obj, "");
                                if (c6921lAmazon != null) {
                                    yandex(3);
                                    throw null;
                                }
                                if (!c6921lAmazon.f14494l) {
                                    objInvoke = c6921lAmazon.f14493l;
                                } else {
                                    if (objInvoke != null) {
                                        concurrentHashMap.put(obj, enumC12766l);
                                        objInvoke = ((Function1) obj2).invoke(obj);
                                        if (objInvoke == null) {
                                            obj6 = objInvoke;
                                        }
                                        objPut = concurrentHashMap.put(obj, obj6);
                                        if (objPut == enumC12766l) {
                                            assertionErrorMopub = mopub(obj, objPut);
                                            throw assertionErrorMopub;
                                        }
                                        interfaceC2082l.unlock();
                                        throw th;
                                    }
                                    AbstractC12408l.yandex(objInvoke);
                                    if (objInvoke == obj6) {
                                        objInvoke = null;
                                    }
                                }
                            } else {
                                if (objInvoke != null) {
                                    concurrentHashMap.put(obj, enumC12766l);
                                    objInvoke = ((Function1) obj2).invoke(obj);
                                    if (objInvoke == null) {
                                        obj6 = objInvoke;
                                    }
                                    objPut = concurrentHashMap.put(obj, obj6);
                                    if (objPut == enumC12766l) {
                                        assertionErrorMopub = mopub(obj, objPut);
                                        throw assertionErrorMopub;
                                    }
                                    interfaceC2082l.unlock();
                                    throw th;
                                }
                                AbstractC12408l.yandex(objInvoke);
                                if (objInvoke == obj6) {
                                    objInvoke = null;
                                }
                            }
                        } else {
                            objInvoke = c6921lAmazon2.f14493l;
                        }
                    } else if (objInvoke != enumC12766l2) {
                        c6921lAmazon = c16412l.amazon(obj, "");
                        if (c6921lAmazon != null) {
                            yandex(3);
                            throw null;
                        }
                        if (!c6921lAmazon.f14494l) {
                            objInvoke = c6921lAmazon.f14493l;
                        } else {
                            if (objInvoke != null) {
                                concurrentHashMap.put(obj, enumC12766l);
                                objInvoke = ((Function1) obj2).invoke(obj);
                                if (objInvoke == null) {
                                    obj6 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj6);
                                if (objPut == enumC12766l) {
                                    assertionErrorMopub = mopub(obj, objPut);
                                    throw assertionErrorMopub;
                                }
                                interfaceC2082l.unlock();
                                throw th;
                            }
                            AbstractC12408l.yandex(objInvoke);
                            if (objInvoke == obj6) {
                                objInvoke = null;
                            }
                        }
                    } else {
                        if (objInvoke != null) {
                            try {
                                concurrentHashMap.put(obj, enumC12766l);
                                objInvoke = ((Function1) obj2).invoke(obj);
                                if (objInvoke == null) {
                                    obj6 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj6);
                                if (objPut == enumC12766l) {
                                    assertionErrorMopub = mopub(obj, objPut);
                                    throw assertionErrorMopub;
                                }
                            } catch (Throwable th) {
                                if (AbstractC7985l.amazon(th)) {
                                    try {
                                        Object objRemove = concurrentHashMap.remove(obj);
                                        if (objRemove != enumC12766l) {
                                            throw billing(obj, objRemove);
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        throw admob(obj, th2);
                                    }
                                }
                                if (th != assertionErrorMopub) {
                                    Object objPut2 = concurrentHashMap.put(obj, new C2501l(th));
                                    if (objPut2 != enumC12766l) {
                                        throw mopub(obj, objPut2);
                                    }
                                    c1461l.getClass();
                                    throw th;
                                }
                                try {
                                    concurrentHashMap.remove(obj);
                                    c1461l.getClass();
                                    throw th;
                                } catch (Throwable th3) {
                                    throw admob(obj, th3);
                                }
                            }
                            interfaceC2082l.unlock();
                            throw th;
                        }
                        AbstractC12408l.yandex(objInvoke);
                        if (objInvoke == obj6) {
                            objInvoke = null;
                        }
                    }
                    interfaceC2082l.unlock();
                    return objInvoke;
                } catch (Throwable th4) {
                    interfaceC2082l.unlock();
                    throw th4;
                }
            default:
                C11250l c11250l = (C11250l) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                ViewTreeObserverOnPreDrawListenerC4527l viewTreeObserverOnPreDrawListenerC4527l = (ViewTreeObserverOnPreDrawListenerC4527l) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4527l);
                } else {
                    c11250l.f22673l.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4527l);
                }
                return Unit.INSTANCE;
        }
    }

    public AssertionError mopub(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((C16412l) this.f35307l));
        C16412l.purchase(assertionError);
        return assertionError;
    }
}
