package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؙۡۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6821l implements InterfaceC13362l {
    public final C13734l adcel;
    public String admob;
    public boolean ads;
    public int amazon;
    public int billing;
    public int crashlytics;
    public int firebase;
    public CharSequence isPro;
    public int loadAd;
    public boolean metrica;
    public boolean mopub;
    public int purchase;
    public ArrayList remoteconfig;
    public CharSequence smaato;
    public ArrayList startapp;
    public int subs;
    public int subscription;
    public ArrayList vip;
    public final ArrayList yandex;

    public C6821l(C13734l c13734l) {
        c13734l.m3741package();
        C6239l c6239l = c13734l.pro;
        if (c6239l != null) {
            c6239l.f13181l.getClassLoader();
        }
        this.yandex = new ArrayList();
        this.metrica = false;
        this.subscription = -1;
        this.adcel = c13734l;
    }

    public final void amazon() {
        ArrayList arrayList = this.yandex;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C10937l c10937l = (C10937l) arrayList.get(size);
            if (c10937l.crashlytics) {
                if (c10937l.yandex == 8) {
                    c10937l.crashlytics = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = c10937l.loadAd.f8970l;
                    c10937l.yandex = 2;
                    c10937l.crashlytics = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C10937l c10937l2 = (C10937l) arrayList.get(i2);
                        if (c10937l2.crashlytics && c10937l2.loadAd.f8970l == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void billing(int i, AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l, String str) {
        String str2 = abstractComponentCallbacksC4411l.f8958l;
        if (str2 != null) {
            AbstractC7311l.crashlytics(abstractComponentCallbacksC4411l, str2);
        }
        Class<?> cls = abstractComponentCallbacksC4411l.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            C18353l.vip(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC4411l.f8978l;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC4411l);
                sb.append(": was ");
                C8339l.smaato(AbstractC9361l.ad(sb, abstractComponentCallbacksC4411l.f8978l, " now ", str));
                return;
            }
            abstractComponentCallbacksC4411l.f8978l = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC4411l + " with tag " + str + " to container view with no id");
            }
            int i2 = abstractComponentCallbacksC4411l.f8962l;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC4411l);
                int i3 = abstractComponentCallbacksC4411l.f8962l;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC4411l.f8962l = i;
            abstractComponentCallbacksC4411l.f8970l = i;
        }
        loadAd(new C10937l(1, abstractComponentCallbacksC4411l));
        abstractComponentCallbacksC4411l.f8955l = this.adcel;
    }

    public final void crashlytics(int i) {
        if (this.mopub) {
            if (C13734l.m3727volatile(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.yandex;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C10937l c10937l = (C10937l) arrayList.get(i2);
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c10937l.loadAd;
                if (abstractComponentCallbacksC4411l != null) {
                    abstractComponentCallbacksC4411l.f8966l += i;
                    if (C13734l.m3727volatile(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c10937l.loadAd + " to " + c10937l.loadAd.f8966l);
                    }
                }
            }
        }
    }

    public final void loadAd(C10937l c10937l) {
        this.yandex.add(c10937l);
        c10937l.amazon = this.loadAd;
        c10937l.purchase = this.crashlytics;
        c10937l.billing = this.amazon;
        c10937l.mopub = this.purchase;
    }

    public final void mopub(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.admob);
            printWriter.print(" mIndex=");
            printWriter.print(this.subscription);
            printWriter.print(" mCommitted=");
            printWriter.println(this.ads);
            if (this.billing != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.billing));
            }
            if (this.loadAd != 0 || this.crashlytics != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.loadAd));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.crashlytics));
            }
            if (this.amazon != 0 || this.purchase != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.amazon));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.purchase));
            }
            if (this.subs != 0 || this.isPro != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.subs));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.isPro);
            }
            if (this.firebase != 0 || this.smaato != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.firebase));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.smaato);
            }
        }
        ArrayList arrayList = this.yandex;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C10937l c10937l = (C10937l) arrayList.get(i);
            switch (c10937l.yandex) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c10937l.yandex;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c10937l.loadAd);
            if (z) {
                if (c10937l.amazon != 0 || c10937l.purchase != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c10937l.amazon));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c10937l.purchase));
                }
                if (c10937l.billing != 0 || c10937l.mopub != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c10937l.billing));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c10937l.mopub));
                }
            }
        }
    }

    public final int purchase(boolean z, boolean z2) {
        if (this.ads) {
            C8339l.smaato("commit already called");
            return 0;
        }
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2959l());
            mopub("  ", printWriter, true);
            printWriter.close();
        }
        this.ads = true;
        boolean z3 = this.mopub;
        C13734l c13734l = this.adcel;
        if (z3) {
            this.subscription = c13734l.firebase.getAndIncrement();
        } else {
            this.subscription = -1;
        }
        if (z2) {
            c13734l.advert(this, z);
        }
        return this.subscription;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.subscription >= 0) {
            sb.append(" #");
            sb.append(this.subscription);
        }
        if (this.admob != null) {
            sb.append(" ");
            sb.append(this.admob);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC13362l
    public final boolean yandex(ArrayList arrayList, ArrayList arrayList2) {
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.mopub) {
            return true;
        }
        this.adcel.amazon.add(this);
        return true;
    }
}
