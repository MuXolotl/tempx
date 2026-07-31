package defpackage;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11748l {
    public static final EnumC9176l admob(int i) {
        if (i == 0) {
            return EnumC9176l.f18878l;
        }
        if (i == 1) {
            return EnumC9176l.f18877l;
        }
        if (i == 2) {
            return EnumC9176l.f18875l;
        }
        if (i == 3) {
            return EnumC9176l.f18880l;
        }
        if (i == 4) {
            return EnumC9176l.f18879l;
        }
        if (i == 5) {
            return EnumC9176l.f18881l;
        }
        C8339l.metrica(AbstractC15560l.tapsense("Could not convert ", i, " to State"));
        return null;
    }

    public static final C11096l amazon(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C11096l) weakReference.get();
        }
        return null;
    }

    public static final int billing(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        C8339l.metrica(AbstractC15560l.tapsense("Could not convert ", i, " to NetworkType"));
        return 0;
    }

    public static final View crashlytics(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(loadAd(view, R.id.view_tree_lifecycle_owner), loadAd(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (amazon(view) == null) {
                i++;
                Object objBilling = AbstractC6710l.billing(view);
                View view4 = view2;
                view2 = view;
                view = objBilling instanceof View ? (View) objBilling : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final C2234l firebase(InterfaceC11641l interfaceC11641l, String str, C17721l c17721l, Function1 function1) {
        AbstractC15096l c5376l;
        C6981l c6981l = new C6981l(c17721l);
        C4569l c4569l = C4569l.loadAd;
        List list = AbstractC13402l.amazon(str).yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6980l c6980l = (C6980l) list.get(i);
            String str2 = c6980l.yandex;
            int iInmobi = AbstractC5020l.inmobi(c6980l.loadAd);
            if (iInmobi == 0) {
                c5376l = str2.equals("*") ? C8049l.loadAd : new C5376l(str2);
            } else {
                if (iInmobi != 1) {
                    C18725l.billing();
                    return null;
                }
                int iM3321extends = AbstractC12024l.m3321extends(str2, '{', 0, 6);
                int iM3343switch = AbstractC12024l.m3343switch(str2, '}', 0, 6);
                String strSubstring = iM3321extends == 0 ? null : str2.substring(0, iM3321extends);
                String strSubstring2 = iM3343switch == str2.length() - 1 ? null : str2.substring(iM3343switch + 1);
                String strSubstring3 = str2.substring(iM3321extends + 1, iM3343switch);
                if (AbstractC16648l.Signature(strSubstring3, "?", false)) {
                    c5376l = new C8287l(AbstractC12024l.m3335package(1, strSubstring3), strSubstring, strSubstring2);
                } else if (!AbstractC16648l.Signature(strSubstring3, "...", false)) {
                    c5376l = new C2023l(strSubstring3, strSubstring, strSubstring2);
                } else {
                    if (strSubstring2 != null && strSubstring2.length() != 0) {
                        C8339l.metrica("Suffix after tailcard is not supported");
                        return null;
                    }
                    String strM3335package = AbstractC12024l.m3335package(3, strSubstring3);
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                    c5376l = new C9702l(strM3335package, strSubstring);
                }
            }
            interfaceC11641l = ((C2234l) interfaceC11641l).startapp(c5376l);
        }
        if (AbstractC16648l.Signature(str, "/", false)) {
            interfaceC11641l = ((C2234l) interfaceC11641l).startapp(C18345l.loadAd);
        }
        C2234l c2234lStartapp = ((C2234l) interfaceC11641l).startapp(c6981l);
        function1.invoke(c2234lStartapp);
        return c2234lStartapp;
    }

    public static InterfaceC17242l isPro(InterfaceC17242l interfaceC17242l, AbstractC14165l abstractC14165l, InterfaceC13460l interfaceC13460l, InterfaceC17030l interfaceC17030l, float f, AbstractC8939l abstractC8939l, int i) {
        if ((i & 4) != 0) {
            interfaceC13460l = C18450l.f36043l;
        }
        InterfaceC13460l interfaceC13460l2 = interfaceC13460l;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return interfaceC17242l.premium(new C14304l(abstractC14165l, interfaceC13460l2, interfaceC17030l, f, abstractC8939l));
    }

    public static final int loadAd(View view, int i) {
        int i2 = 0;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objBilling = AbstractC6710l.billing(view);
            view = objBilling instanceof View ? (View) objBilling : null;
        }
        return i3;
    }

    public static final int mopub(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        C8339l.metrica(AbstractC15560l.tapsense("Could not convert ", i, " to OutOfQuotaPolicy"));
        return 0;
    }

    public static final int purchase(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        C8339l.metrica(AbstractC15560l.tapsense("Could not convert ", i, " to BackoffPolicy"));
        return 0;
    }

    public static final C8891l remoteconfig(byte[] bArr) throws IOException {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new C8891l(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                C8891l c8891lSmaato = AbstractC13950l.smaato(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return c8891lSmaato;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7876l.loadAd(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final int smaato(EnumC9176l enumC9176l) {
        int iOrdinal = enumC9176l.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        C18725l.billing();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final boolean subs(AbstractC18041l abstractC18041l) {
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof C14487l) {
            return true;
        }
        return (abstractC14318lMo3847class instanceof AbstractC4317l) && (((AbstractC4317l) abstractC14318lMo3847class).mo687implements() instanceof C14487l);
    }

    public static final LinkedHashSet yandex(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashSet.add(new C0047l(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    Unit unit = Unit.INSTANCE;
                    objectInputStream.close();
                    Unit unit2 = Unit.INSTANCE;
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7876l.loadAd(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }
}
