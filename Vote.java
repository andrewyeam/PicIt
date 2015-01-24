package ayeam1.PicIt;

import android.app.Activity;
import android.view.MotionEvent;

/**
 * Created by ayeam1 on 11/20/2014.
 */
public class Vote extends Activity {


    private void UVote() {




    }

    public int getValue(){return count;}

        public String toString(){return "Vote["+count+"]";}

        //muttators
        private void addOne(){
            do{
                count=count+1;;
            }while(count<=999);}
        public void minusOne(){
            do {
                count = count - 1;
                ;
            }while(-999 <= count);
            }
        }
    };]

        public void reset(){
            if(count>999)
                count=0;}

        public static void main(String[] args)
        {
            Vote c1=new Vote();
            Vote c2=new Vote();
            c2.addOne();
            int result=c1.getValue();


        }
    }



    public class DVote {
        GestureDoubleTap = new GestureDoubleTap ()

        public boolean onTouchEvent [MotionEvent e]

        public GestureDetector.onDoubleTapListener () {
            return GestureDetector;
    }
        }